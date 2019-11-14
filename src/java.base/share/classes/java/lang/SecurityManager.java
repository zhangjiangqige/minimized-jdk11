package java.lang;

import org.checkerframework.checker.interning.qual.UsesObjectEquals;
import org.checkerframework.framework.qual.AnnotatedFor;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleDescriptor.Exports;
import java.lang.module.ModuleDescriptor.Opens;
import java.lang.module.ModuleReference;
import java.lang.reflect.Member;
import java.io.FileDescriptor;
import java.io.File;
import java.io.FilePermission;
import java.net.InetAddress;
import java.net.SocketPermission;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permission;
import java.security.PrivilegedAction;
import java.security.Security;
import java.security.SecurityPermission;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.PropertyPermission;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import jdk.internal.module.ModuleBootstrap;
import jdk.internal.module.ModuleLoaderMap;
import jdk.internal.reflect.CallerSensitive;
import sun.security.util.SecurityConstants;

@AnnotatedFor({ "interning", "nullness" })
@UsesObjectEquals
public class SecurityManager {

    private boolean initialized = false;

    public SecurityManager() {
        synchronized (SecurityManager.class) {
            SecurityManager sm = System.getSecurityManager();
            if (sm != null) {
                sm.checkPermission(new RuntimePermission("createSecurityManager"));
            }
            initialized = true;
        }
    }

    protected native Class<?>[] getClassContext();

    public Object getSecurityContext();

    public void checkPermission(Permission perm);

    public void checkPermission(Permission perm, Object context);

    public void checkCreateClassLoader();

    private static ThreadGroup rootGroup = getRootGroup();

    private static ThreadGroup getRootGroup();

    public void checkAccess(Thread t);

    public void checkAccess(ThreadGroup g);

    public void checkExit(int status);

    public void checkExec(String cmd);

    public void checkLink(String lib);

    public void checkRead(FileDescriptor fd);

    public void checkRead(String file);

    public void checkRead(String file, Object context);

    public void checkWrite(FileDescriptor fd);

    public void checkWrite(String file);

    public void checkDelete(String file);

    public void checkConnect(String host, int port);

    public void checkConnect(String host, int port, Object context);

    public void checkListen(int port);

    public void checkAccept(String host, int port);

    public void checkMulticast(InetAddress maddr);

    @Deprecated(since = "1.4")
    public void checkMulticast(InetAddress maddr, byte ttl);

    public void checkPropertiesAccess();

    public void checkPropertyAccess(String key);

    public void checkPrintJobAccess();

    private static boolean packageAccessValid = false;

    private static String[] packageAccess;

    private static final Object packageAccessLock = new Object();

    private static boolean packageDefinitionValid = false;

    private static String[] packageDefinition;

    private static final Object packageDefinitionLock = new Object();

    private static String[] getPackages(String p);

    private static final Map<String, Boolean> nonExportedPkgs = new ConcurrentHashMap<>();

    static {
        addNonExportedPackages(ModuleLayer.boot());
    }

    static void addNonExportedPackages(ModuleLayer layer);

    static void invalidatePackageAccessCache();

    private static Set<String> nonExportedPkgs(ModuleDescriptor md);

    public void checkPackageAccess(String pkg);

    public void checkPackageDefinition(String pkg);

    public void checkSetFactory();

    public void checkSecurityAccess(String target);

    public ThreadGroup getThreadGroup();
}
package javax.swing;

import org.checkerframework.checker.guieffect.qual.SafeEffect;
import org.checkerframework.checker.guieffect.qual.UI;
import org.checkerframework.checker.guieffect.qual.UIType;
import org.checkerframework.framework.qual.AnnotatedFor;
import sun.reflect.misc.ReflectUtil;
import sun.swing.SwingUtilities2;
import sun.swing.UIAction;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.dnd.DropTarget;
import java.lang.reflect.*;
import javax.accessibility.*;
import javax.swing.event.MenuDragMouseEvent;
import javax.swing.plaf.UIResource;
import javax.swing.text.View;
import java.security.AccessController;
import sun.security.action.GetPropertyAction;
import sun.awt.AppContext;
import sun.awt.AWTAccessor;
import sun.awt.AWTAccessor.MouseEventAccessor;

@AnnotatedFor({ "guieffect" })
@UIType
public class SwingUtilities implements SwingConstants {

    private static boolean canAccessEventQueue = false;

    private static boolean eventQueueTested = false;

    private static boolean suppressDropSupport;

    private static boolean checkedSuppressDropSupport;

    private static boolean getSuppressDropTarget();

    static void installSwingDropTargetAsNecessary(Component c, TransferHandler t);

    public static final boolean isRectangleContainingRectangle(Rectangle a, Rectangle b);

    public static Rectangle getLocalBounds(Component aComponent);

    public static Window getWindowAncestor(Component c);

    static Point convertScreenLocationToParent(Container parent, int x, int y);

    public static Point convertPoint(Component source, Point aPoint, Component destination);

    public static Point convertPoint(Component source, int x, int y, Component destination);

    public static Rectangle convertRectangle(Component source, Rectangle aRectangle, Component destination);

    public static Container getAncestorOfClass(Class<?> c, Component comp);

    public static Container getAncestorNamed(String name, Component comp);

    public static Component getDeepestComponentAt(Component parent, int x, int y);

    @SuppressWarnings("deprecation")
    public static MouseEvent convertMouseEvent(Component source, MouseEvent sourceEvent, Component destination);

    @SuppressWarnings("deprecation")
    public static void convertPointToScreen(Point p, Component c);

    @SuppressWarnings("deprecation")
    public static void convertPointFromScreen(Point p, Component c);

    public static Window windowForComponent(Component c);

    public static boolean isDescendingFrom(Component a, Component b);

    public static Rectangle computeIntersection(int x, int y, int width, int height, Rectangle dest);

    public static Rectangle computeUnion(int x, int y, int width, int height, Rectangle dest);

    public static Rectangle[] computeDifference(Rectangle rectA, Rectangle rectB);

    private static boolean checkMouseButton(MouseEvent anEvent, int mouseButton, int mouseButtonDownMask);

    public static boolean isLeftMouseButton(MouseEvent anEvent);

    public static boolean isMiddleMouseButton(MouseEvent anEvent);

    public static boolean isRightMouseButton(MouseEvent anEvent);

    public static int computeStringWidth(FontMetrics fm, String str);

    public static String layoutCompoundLabel(JComponent c, FontMetrics fm, String text, Icon icon, int verticalAlignment, int horizontalAlignment, int verticalTextPosition, int horizontalTextPosition, Rectangle viewR, Rectangle iconR, Rectangle textR, int textIconGap);

    public static String layoutCompoundLabel(FontMetrics fm, String text, Icon icon, int verticalAlignment, int horizontalAlignment, int verticalTextPosition, int horizontalTextPosition, Rectangle viewR, Rectangle iconR, Rectangle textR, int textIconGap);

    private static String layoutCompoundLabelImpl(JComponent c, FontMetrics fm, String text, Icon icon, int verticalAlignment, int horizontalAlignment, int verticalTextPosition, int horizontalTextPosition, Rectangle viewR, Rectangle iconR, Rectangle textR, int textIconGap);

    public static void paintComponent(Graphics g, Component c, Container p, int x, int y, int w, int h);

    public static void paintComponent(Graphics g, Component c, Container p, Rectangle r);

    private static CellRendererPane getCellRendererPane(Component c, Container p);

    public static void updateComponentTreeUI(Component c);

    private static void updateComponentTreeUI0(Component c);

    @SafeEffect
    public static void invokeLater(@UI Runnable doRun);

    @SafeEffect
    public static void invokeAndWait(@UI final Runnable doRun) throws InterruptedException, InvocationTargetException;

    public static boolean isEventDispatchThread();

    public static int getAccessibleIndexInParent(Component c);

    public static Accessible getAccessibleAt(Component c, Point p);

    public static AccessibleStateSet getAccessibleStateSet(Component c);

    public static int getAccessibleChildrenCount(Component c);

    public static Accessible getAccessibleChild(Component c, int i);

    @Deprecated
    public static Component findFocusOwner(Component c);

    public static JRootPane getRootPane(Component c);

    @SuppressWarnings("deprecation")
    public static Component getRoot(Component c);

    static JComponent getPaintingOrigin(JComponent c);

    @SuppressWarnings("deprecation")
    public static boolean processKeyBindings(KeyEvent event);

    static boolean isValidKeyEventForKeyBindings(KeyEvent e);

    public static boolean notifyAction(Action action, KeyStroke ks, KeyEvent event, Object sender, int modifiers);

    public static void replaceUIInputMap(JComponent component, int type, InputMap uiInputMap);

    public static void replaceUIActionMap(JComponent component, ActionMap uiActionMap);

    public static InputMap getUIInputMap(JComponent component, int condition);

    public static ActionMap getUIActionMap(JComponent component);

    private static final Object sharedOwnerFrameKey = new StringBuffer("SwingUtilities.sharedOwnerFrame");

    @SuppressWarnings("serial")
    static class SharedOwnerFrame extends Frame implements WindowListener {

        public void addNotify();

        void installListeners();

        public void windowClosed(WindowEvent e);

        public void windowOpened(WindowEvent e);

        public void windowClosing(WindowEvent e);

        public void windowIconified(WindowEvent e);

        public void windowDeiconified(WindowEvent e);

        public void windowActivated(WindowEvent e);

        public void windowDeactivated(WindowEvent e);

        @SuppressWarnings("deprecation")
        public void show();

        public void dispose();
    }

    static Frame getSharedOwnerFrame() throws HeadlessException;

    static WindowListener getSharedOwnerFrameShutdownListener() throws HeadlessException;

    static Object appContextGet(Object key);

    static void appContextPut(Object key, Object value);

    static void appContextRemove(Object key);

    static Class<?> loadSystemClass(String className) throws ClassNotFoundException;

    static boolean isLeftToRight(Component c);

    private SwingUtilities() {
        throw new Error("SwingUtilities is just a container for static methods");
    }

    static boolean doesIconReferenceImage(Icon icon, Image image);

    static int findDisplayedMnemonicIndex(String text, int mnemonic);

    public static Rectangle calculateInnerArea(JComponent c, Rectangle r);

    static void updateRendererOrEditorUI(Object rendererOrEditor);

    public static Container getUnwrappedParent(Component component);

    public static Component getUnwrappedView(JViewport viewport);

    @SuppressWarnings("deprecation")
    static Container getValidateRoot(Container c, boolean visibleOnly);
}

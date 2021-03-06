package org.atmosphere.jboss.websockets.frame;

import org.atmosphere.jboss.websockets.FrameType;

/**
 * A socket closing frame. Writing this frame to the WebSocket will signal to the remote they must disconnect.
 *
 * @author Mike Brock
 */
public class CloseFrame extends AbstractFrame {
  private static final CloseFrame INSTANCE = new CloseFrame();

  private CloseFrame() {
    super(FrameType.ConnectionClose);
  }

  public static CloseFrame get() {
    return INSTANCE;
  }
}

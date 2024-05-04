package edu.wpi.first.wpilibj2.command.button;

import java.util.function.BooleanSupplier;

import edu.wpi.first.wpilibj.event.EventLoop;
import edu.wpi.first.wpilibj2.command.Command;

/** Thin wrapper around {@link Trigger} to alias {@link #onTrue(Command)} and {@link #onFalse(Command)} for readability when constructing {@link Trigger}s inline. 
 * <p>This class is provided by the NewCommands VendorDep
*/
public class InlineTrigger extends Trigger {

  /**
   * Wrapper around Trigger constructor.
   *
   * @param loop The loop instance that polls this trigger.
   * @param condition the condition represented by this trigger
   */
  protected InlineTrigger(EventLoop loop, BooleanSupplier condition) {
    super(loop, condition);
  }

  /**
   * Wrapper around Trigger constructor.
   *
   * <p>Polled by the default scheduler button loop.
   *
   * @param condition the condition represented by this trigger
   */
  protected InlineTrigger(BooleanSupplier condition) {
    super(condition);
  }
  
  /**
   * Starts the given command whenever the condition changes from `false` to `true`.
   * 
   * Wrapper around {@link #onTrue(Command)}
   *
   * @param command the command to start
   * @return this trigger, so calls can be chained
   */
  public Trigger turnsTrue(Command command) {
    return super.onTrue(command);
  }

  /**
   * Starts the given command whenever the condition changes from `true` to `false`.
   *
   * Wrapper around {@link #onFalse(Command)}
   * 
   * @param command the command to start
   * @return this trigger, so calls can be chained
   */
  public Trigger turnsFalse(Command command) {
    return super.onFalse(command);
  }
}

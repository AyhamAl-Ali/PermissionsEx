/**
 * PermissionsEx
 * Copyright (C) zml and PermissionsEx contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ninja.leaping.permissionsex.logging;

import org.slf4j.Logger;
import org.slf4j.Marker;

import java.util.Locale;

/**
 * An implementation of {@link TranslatableLogger} that delegates to an existing logger
 */
class WrappingTranslatableLogger implements TranslatableLogger {
    private final Logger wrapping;

    public WrappingTranslatableLogger(Logger wrapping) {
        this.wrapping = wrapping;
    }

    @Override
    public Locale getLogLocale() {
        return Locale.getDefault();
    }

    @Override
    public Locale getLogLocale(Marker marker) {
        return getLogLocale();
    }

    /**
     * Return the name of this <code>Logger</code> instance.
     *
     * @return name of this logger instance
     */
    @Override
    public String getName() {
        return wrapping.getName();
    }

    /**
     * Is the logger instance enabled for the TRACE level?
     *
     * @return True if this Logger is enabled for the TRACE level,
     * false otherwise.
     * @since 1.4
     */
    @Override
    public boolean isTraceEnabled() {
        return wrapping.isTraceEnabled();
    }

    /**
     * Log a message at the TRACE level.
     *
     * @param msg the message string to be logged
     * @since 1.4
     */
    @Override
    public void trace(String msg) {
        wrapping.trace(msg);
    }

    /**
     * Log a message at the TRACE level according to the specified format
     * and argument.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the TRACE level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     * @since 1.4
     */
    @Override
    public void trace(String format, Object arg) {
        wrapping.trace(format, arg);
    }

    /**
     * Log a message at the TRACE level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the TRACE level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @since 1.4
     */
    @Override
    public void trace(String format, Object arg1, Object arg2) {
        wrapping.trace(format, arg1, arg2);
    }

    /**
     * Log a message at the TRACE level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the TRACE level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for TRACE. The variants taking {@link #trace(String, Object) one} and
     * {@link #trace(String, Object, Object) two} arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     * @since 1.4
     */
    @Override
    public void trace(String format, Object... arguments) {
        wrapping.trace(format, arguments);
    }

    /**
     * Log an exception (throwable) at the TRACE level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     * @since 1.4
     */
    @Override
    public void trace(String msg, Throwable t) {
        wrapping.trace(msg, t);
    }

    /**
     * Similar to {@link #isTraceEnabled()} method except that the
     * marker data is also taken into account.
     *
     * @param marker The marker data to take into consideration
     * @return True if this Logger is enabled for the TRACE level,
     * false otherwise.
     * @since 1.4
     */
    @Override
    public boolean isTraceEnabled(Marker marker) {
        return wrapping.isTraceEnabled(marker);
    }

    /**
     * Log a message with the specific Marker at the TRACE level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message string to be logged
     * @since 1.4
     */
    @Override
    public void trace(Marker marker, String msg) {
        wrapping.trace(marker, msg);
    }

    /**
     * This method is similar to {@link #trace(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     * @since 1.4
     */
    @Override
    public void trace(Marker marker, String format, Object arg) {
        wrapping.trace(marker, format, arg);
    }

    /**
     * This method is similar to {@link #trace(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     * @since 1.4
     */
    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        wrapping.trace(marker, format, arg1, arg2);
    }

    /**
     * This method is similar to {@link #trace(String, Object...)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker   the marker data specific to this log statement
     * @param format   the format string
     * @param argArray an array of arguments
     * @since 1.4
     */
    @Override
    public void trace(Marker marker, String format, Object... argArray) {
        wrapping.trace(marker, format, argArray);
    }

    /**
     * This method is similar to {@link #trace(String, Throwable)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     * @since 1.4
     */
    @Override
    public void trace(Marker marker, String msg, Throwable t) {
        wrapping.trace(marker, msg, t);
    }

    /**
     * Is the logger instance enabled for the DEBUG level?
     *
     * @return True if this Logger is enabled for the DEBUG level,
     * false otherwise.
     */
    @Override
    public boolean isDebugEnabled() {
        return wrapping.isDebugEnabled();
    }

    /**
     * Log a message at the DEBUG level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void debug(String msg) {
        wrapping.debug(msg);
    }

    /**
     * Log a message at the DEBUG level according to the specified format
     * and argument.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the DEBUG level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    @Override
    public void debug(String format, Object arg) {
        wrapping.debug(format, arg);
    }

    /**
     * Log a message at the DEBUG level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the DEBUG level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    @Override
    public void debug(String format, Object arg1, Object arg2) {
        wrapping.debug(format, arg1, arg2);
    }

    /**
     * Log a message at the DEBUG level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the DEBUG level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for DEBUG. The variants taking
     * {@link #debug(String, Object) one} and {@link #debug(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    @Override
    public void debug(String format, Object... arguments) {
        wrapping.debug(format, arguments);
    }

    /**
     * Log an exception (throwable) at the DEBUG level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     */
    @Override
    public void debug(String msg, Throwable t) {
        wrapping.debug(msg, t);
    }

    /**
     * Similar to {@link #isDebugEnabled()} method except that the
     * marker data is also taken into account.
     *
     * @param marker The marker data to take into consideration
     * @return True if this Logger is enabled for the DEBUG level,
     * false otherwise.
     */
    @Override
    public boolean isDebugEnabled(Marker marker) {
        return wrapping.isDebugEnabled(marker);
    }

    /**
     * Log a message with the specific Marker at the DEBUG level.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message string to be logged
     */
    @Override
    public void debug(Marker marker, String msg) {
        wrapping.debug(marker, msg);
    }

    /**
     * This method is similar to {@link #debug(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     */
    @Override
    public void debug(Marker marker, String format, Object arg) {
        wrapping.debug(marker, format, arg);
    }

    /**
     * This method is similar to {@link #debug(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        wrapping.debug(marker, format, arg1, arg2);
    }

    /**
     * This method is similar to {@link #debug(String, Object...)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker    the marker data specific to this log statement
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    @Override
    public void debug(Marker marker, String format, Object... arguments) {
        wrapping.debug(marker, format, arguments);
    }

    /**
     * This method is similar to {@link #debug(String, Throwable)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     */
    @Override
    public void debug(Marker marker, String msg, Throwable t) {
        wrapping.debug(marker, msg, t);
    }

    /**
     * Is the logger instance enabled for the INFO level?
     *
     * @return True if this Logger is enabled for the INFO level,
     * false otherwise.
     */
    @Override
    public boolean isInfoEnabled() {
        return wrapping.isInfoEnabled();
    }

    /**
     * Log a message at the INFO level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void info(String msg) {
        wrapping.info(msg);
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and argument.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the INFO level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    @Override
    public void info(String format, Object arg) {
        wrapping.info(format, arg);
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the INFO level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    @Override
    public void info(String format, Object arg1, Object arg2) {
        wrapping.info(format, arg1, arg2);
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the INFO level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for INFO. The variants taking
     * {@link #info(String, Object) one} and {@link #info(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    @Override
    public void info(String format, Object... arguments) {
        wrapping.info(format, arguments);
    }

    /**
     * Log an exception (throwable) at the INFO level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     */
    @Override
    public void info(String msg, Throwable t) {
        wrapping.info(msg, t);
    }

    /**
     * Similar to {@link #isInfoEnabled()} method except that the marker
     * data is also taken into consideration.
     *
     * @param marker The marker data to take into consideration
     * @return true if this logger is warn enabled, false otherwise
     */
    @Override
    public boolean isInfoEnabled(Marker marker) {
        return wrapping.isInfoEnabled(marker);
    }

    /**
     * Log a message with the specific Marker at the INFO level.
     *
     * @param marker The marker specific to this log statement
     * @param msg    the message string to be logged
     */
    @Override
    public void info(Marker marker, String msg) {
        wrapping.info(marker, msg);
    }

    /**
     * This method is similar to {@link #info(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     */
    @Override
    public void info(Marker marker, String format, Object arg) {
        wrapping.info(marker, format, arg);
    }

    /**
     * This method is similar to {@link #info(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        wrapping.info(marker, format, arg1, arg2);
    }

    /**
     * This method is similar to {@link #info(String, Object...)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker    the marker data specific to this log statement
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    @Override
    public void info(Marker marker, String format, Object... arguments) {
        wrapping.info(marker, format, arguments);
    }

    /**
     * This method is similar to {@link #info(String, Throwable)} method
     * except that the marker data is also taken into consideration.
     *
     * @param marker the marker data for this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     */
    @Override
    public void info(Marker marker, String msg, Throwable t) {
        wrapping.info(marker, msg, t);
    }

    /**
     * Is the logger instance enabled for the WARN level?
     *
     * @return True if this Logger is enabled for the WARN level,
     * false otherwise.
     */
    @Override
    public boolean isWarnEnabled() {
        return wrapping.isWarnEnabled();
    }

    /**
     * Log a message at the WARN level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void warn(String msg) {
        wrapping.warn(msg);
    }

    /**
     * Log a message at the WARN level according to the specified format
     * and argument.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the WARN level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    @Override
    public void warn(String format, Object arg) {
        wrapping.warn(format, arg);
    }

    /**
     * Log a message at the WARN level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the WARN level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for WARN. The variants taking
     * {@link #warn(String, Object) one} and {@link #warn(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    @Override
    public void warn(String format, Object... arguments) {
        wrapping.warn(format, arguments);
    }

    /**
     * Log a message at the WARN level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the WARN level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    @Override
    public void warn(String format, Object arg1, Object arg2) {
        wrapping.warn(format, arg1, arg2);
    }

    /**
     * Log an exception (throwable) at the WARN level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     */
    @Override
    public void warn(String msg, Throwable t) {
        wrapping.warn(msg, t);
    }

    /**
     * Similar to {@link #isWarnEnabled()} method except that the marker
     * data is also taken into consideration.
     *
     * @param marker The marker data to take into consideration
     * @return True if this Logger is enabled for the WARN level,
     * false otherwise.
     */
    @Override
    public boolean isWarnEnabled(Marker marker) {
        return wrapping.isWarnEnabled(marker);
    }

    /**
     * Log a message with the specific Marker at the WARN level.
     *
     * @param marker The marker specific to this log statement
     * @param msg    the message string to be logged
     */
    @Override
    public void warn(Marker marker, String msg) {
        wrapping.warn(marker, msg);
    }

    /**
     * This method is similar to {@link #warn(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     */
    @Override
    public void warn(Marker marker, String format, Object arg) {
        wrapping.warn(marker, format, arg);
    }

    /**
     * This method is similar to {@link #warn(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        wrapping.warn(marker, format, arg1, arg2);
    }

    /**
     * This method is similar to {@link #warn(String, Object...)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker    the marker data specific to this log statement
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    @Override
    public void warn(Marker marker, String format, Object... arguments) {
        wrapping.warn(marker, format, arguments);
    }

    /**
     * This method is similar to {@link #warn(String, Throwable)} method
     * except that the marker data is also taken into consideration.
     *
     * @param marker the marker data for this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     */
    @Override
    public void warn(Marker marker, String msg, Throwable t) {
        wrapping.warn(marker, msg, t);
    }

    /**
     * Is the logger instance enabled for the ERROR level?
     *
     * @return True if this Logger is enabled for the ERROR level,
     * false otherwise.
     */
    @Override
    public boolean isErrorEnabled() {
        return wrapping.isErrorEnabled();
    }

    /**
     * Log a message at the ERROR level.
     *
     * @param msg the message string to be logged
     */
    @Override
    public void error(String msg) {
        wrapping.error(msg);
    }

    /**
     * Log a message at the ERROR level according to the specified format
     * and argument.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the ERROR level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    @Override
    public void error(String format, Object arg) {
        wrapping.error(format, arg);
    }

    /**
     * Log a message at the ERROR level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the ERROR level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    @Override
    public void error(String format, Object arg1, Object arg2) {
        wrapping.error(format, arg1, arg2);
    }

    /**
     * Log a message at the ERROR level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the ERROR level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for ERROR. The variants taking
     * {@link #error(String, Object) one} and {@link #error(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    @Override
    public void error(String format, Object... arguments) {
        wrapping.error(format, arguments);
    }

    /**
     * Log an exception (throwable) at the ERROR level with an
     * accompanying message.
     *
     * @param msg the message accompanying the exception
     * @param t   the exception (throwable) to log
     */
    @Override
    public void error(String msg, Throwable t) {
        wrapping.error(msg, t);
    }

    /**
     * Similar to {@link #isErrorEnabled()} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker The marker data to take into consideration
     * @return True if this Logger is enabled for the ERROR level,
     * false otherwise.
     */
    @Override
    public boolean isErrorEnabled(Marker marker) {
        return wrapping.isErrorEnabled(marker);
    }

    /**
     * Log a message with the specific Marker at the ERROR level.
     *
     * @param marker The marker specific to this log statement
     * @param msg    the message string to be logged
     */
    @Override
    public void error(Marker marker, String msg) {
        wrapping.error(marker, msg);
    }

    /**
     * This method is similar to {@link #error(String, Object)} method except that the
     * marker data is also taken into consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg    the argument
     */
    @Override
    public void error(Marker marker, String format, Object arg) {
        wrapping.error(marker, format, arg);
    }

    /**
     * This method is similar to {@link #error(String, Object, Object)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        wrapping.error(marker, format, arg1, arg2);
    }

    /**
     * This method is similar to {@link #error(String, Object...)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker    the marker data specific to this log statement
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    @Override
    public void error(Marker marker, String format, Object... arguments) {
        wrapping.error(marker, format, arguments);
    }

    /**
     * This method is similar to {@link #error(String, Throwable)}
     * method except that the marker data is also taken into
     * consideration.
     *
     * @param marker the marker data specific to this log statement
     * @param msg    the message accompanying the exception
     * @param t      the exception (throwable) to log
     */
    @Override
    public void error(Marker marker, String msg, Throwable t) {
        wrapping.error(marker, msg, t);
    }
}

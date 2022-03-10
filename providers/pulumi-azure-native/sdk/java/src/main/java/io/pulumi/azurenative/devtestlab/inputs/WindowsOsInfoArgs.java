// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.enums.WindowsOsState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about a Windows OS.
 * 
 */
public final class WindowsOsInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final WindowsOsInfoArgs Empty = new WindowsOsInfoArgs();

    /**
     * The state of the Windows OS (i.e. NonSysprepped, SysprepRequested, SysprepApplied).
     * 
     */
    @InputImport(name="windowsOsState")
      private final @Nullable Input<Either<String,WindowsOsState>> windowsOsState;

    public Input<Either<String,WindowsOsState>> getWindowsOsState() {
        return this.windowsOsState == null ? Input.empty() : this.windowsOsState;
    }

    public WindowsOsInfoArgs(@Nullable Input<Either<String,WindowsOsState>> windowsOsState) {
        this.windowsOsState = windowsOsState;
    }

    private WindowsOsInfoArgs() {
        this.windowsOsState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsOsInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,WindowsOsState>> windowsOsState;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsOsInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.windowsOsState = defaults.windowsOsState;
        }

        public Builder windowsOsState(@Nullable Input<Either<String,WindowsOsState>> windowsOsState) {
            this.windowsOsState = windowsOsState;
            return this;
        }

        public Builder windowsOsState(@Nullable Either<String,WindowsOsState> windowsOsState) {
            this.windowsOsState = Input.ofNullable(windowsOsState);
            return this;
        }
        public WindowsOsInfoArgs build() {
            return new WindowsOsInfoArgs(windowsOsState);
        }
    }
}

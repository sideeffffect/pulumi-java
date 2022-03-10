// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about a Windows OS.
 * 
 */
public final class WindowsOsInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final WindowsOsInfoResponse Empty = new WindowsOsInfoResponse();

    /**
     * The state of the Windows OS (i.e. NonSysprepped, SysprepRequested, SysprepApplied).
     * 
     */
    @InputImport(name="windowsOsState")
      private final @Nullable String windowsOsState;

    public Optional<String> getWindowsOsState() {
        return this.windowsOsState == null ? Optional.empty() : Optional.ofNullable(this.windowsOsState);
    }

    public WindowsOsInfoResponse(@Nullable String windowsOsState) {
        this.windowsOsState = windowsOsState;
    }

    private WindowsOsInfoResponse() {
        this.windowsOsState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsOsInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String windowsOsState;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsOsInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.windowsOsState = defaults.windowsOsState;
        }

        public Builder windowsOsState(@Nullable String windowsOsState) {
            this.windowsOsState = windowsOsState;
            return this;
        }
        public WindowsOsInfoResponse build() {
            return new WindowsOsInfoResponse(windowsOsState);
        }
    }
}

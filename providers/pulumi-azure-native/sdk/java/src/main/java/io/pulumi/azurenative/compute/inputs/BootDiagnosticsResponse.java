// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Boot Diagnostics is a debugging feature which allows you to view Console Output and Screenshot to diagnose VM status. <br><br> You can easily view the output of your console log. <br><br> Azure also enables you to see a screenshot of the VM from the hypervisor.
 * 
 */
public final class BootDiagnosticsResponse extends io.pulumi.resources.InvokeArgs {

    public static final BootDiagnosticsResponse Empty = new BootDiagnosticsResponse();

    /**
     * Whether boot diagnostics should be enabled on the Virtual Machine.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * Uri of the storage account to use for placing the console output and screenshot. <br><br>If storageUri is not specified while enabling boot diagnostics, managed storage will be used.
     * 
     */
    @InputImport(name="storageUri")
      private final @Nullable String storageUri;

    public Optional<String> getStorageUri() {
        return this.storageUri == null ? Optional.empty() : Optional.ofNullable(this.storageUri);
    }

    public BootDiagnosticsResponse(
        @Nullable Boolean enabled,
        @Nullable String storageUri) {
        this.enabled = enabled;
        this.storageUri = storageUri;
    }

    private BootDiagnosticsResponse() {
        this.enabled = null;
        this.storageUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BootDiagnosticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String storageUri;

        public Builder() {
    	      // Empty
        }

        public Builder(BootDiagnosticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.storageUri = defaults.storageUri;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder storageUri(@Nullable String storageUri) {
            this.storageUri = storageUri;
            return this;
        }
        public BootDiagnosticsResponse build() {
            return new BootDiagnosticsResponse(enabled, storageUri);
        }
    }
}

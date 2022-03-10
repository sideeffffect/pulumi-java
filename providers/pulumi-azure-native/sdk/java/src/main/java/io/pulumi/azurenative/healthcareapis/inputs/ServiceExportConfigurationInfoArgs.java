// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Export operation configuration information
 * 
 */
public final class ServiceExportConfigurationInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceExportConfigurationInfoArgs Empty = new ServiceExportConfigurationInfoArgs();

    /**
     * The name of the default export storage account.
     * 
     */
    @InputImport(name="storageAccountName")
      private final @Nullable Input<String> storageAccountName;

    public Input<String> getStorageAccountName() {
        return this.storageAccountName == null ? Input.empty() : this.storageAccountName;
    }

    public ServiceExportConfigurationInfoArgs(@Nullable Input<String> storageAccountName) {
        this.storageAccountName = storageAccountName;
    }

    private ServiceExportConfigurationInfoArgs() {
        this.storageAccountName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceExportConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceExportConfigurationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder storageAccountName(@Nullable Input<String> storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }

        public Builder storageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = Input.ofNullable(storageAccountName);
            return this;
        }
        public ServiceExportConfigurationInfoArgs build() {
            return new ServiceExportConfigurationInfoArgs(storageAccountName);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Export operation configuration information
 * 
 */
public final class FhirServiceExportConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FhirServiceExportConfigurationArgs Empty = new FhirServiceExportConfigurationArgs();

    /**
     * The name of the default export storage account.
     * 
     */
    @Import(name="storageAccountName")
    private @Nullable Output<String> storageAccountName;

    public Optional<Output<String>> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    private FhirServiceExportConfigurationArgs() {}

    private FhirServiceExportConfigurationArgs(FhirServiceExportConfigurationArgs $) {
        this.storageAccountName = $.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FhirServiceExportConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FhirServiceExportConfigurationArgs $;

        public Builder() {
            $ = new FhirServiceExportConfigurationArgs();
        }

        public Builder(FhirServiceExportConfigurationArgs defaults) {
            $ = new FhirServiceExportConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        public FhirServiceExportConfigurationArgs build() {
            return $;
        }
    }

}

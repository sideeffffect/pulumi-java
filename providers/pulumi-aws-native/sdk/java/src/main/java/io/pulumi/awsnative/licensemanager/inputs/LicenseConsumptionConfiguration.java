// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.inputs;

import io.pulumi.awsnative.licensemanager.inputs.LicenseBorrowConfiguration;
import io.pulumi.awsnative.licensemanager.inputs.LicenseProvisionalConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicenseConsumptionConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final LicenseConsumptionConfiguration Empty = new LicenseConsumptionConfiguration();

    @InputImport(name="borrowConfiguration")
      private final @Nullable LicenseBorrowConfiguration borrowConfiguration;

    public Optional<LicenseBorrowConfiguration> getBorrowConfiguration() {
        return this.borrowConfiguration == null ? Optional.empty() : Optional.ofNullable(this.borrowConfiguration);
    }

    @InputImport(name="provisionalConfiguration")
      private final @Nullable LicenseProvisionalConfiguration provisionalConfiguration;

    public Optional<LicenseProvisionalConfiguration> getProvisionalConfiguration() {
        return this.provisionalConfiguration == null ? Optional.empty() : Optional.ofNullable(this.provisionalConfiguration);
    }

    @InputImport(name="renewType")
      private final @Nullable String renewType;

    public Optional<String> getRenewType() {
        return this.renewType == null ? Optional.empty() : Optional.ofNullable(this.renewType);
    }

    public LicenseConsumptionConfiguration(
        @Nullable LicenseBorrowConfiguration borrowConfiguration,
        @Nullable LicenseProvisionalConfiguration provisionalConfiguration,
        @Nullable String renewType) {
        this.borrowConfiguration = borrowConfiguration;
        this.provisionalConfiguration = provisionalConfiguration;
        this.renewType = renewType;
    }

    private LicenseConsumptionConfiguration() {
        this.borrowConfiguration = null;
        this.provisionalConfiguration = null;
        this.renewType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseConsumptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LicenseBorrowConfiguration borrowConfiguration;
        private @Nullable LicenseProvisionalConfiguration provisionalConfiguration;
        private @Nullable String renewType;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseConsumptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.borrowConfiguration = defaults.borrowConfiguration;
    	      this.provisionalConfiguration = defaults.provisionalConfiguration;
    	      this.renewType = defaults.renewType;
        }

        public Builder borrowConfiguration(@Nullable LicenseBorrowConfiguration borrowConfiguration) {
            this.borrowConfiguration = borrowConfiguration;
            return this;
        }

        public Builder provisionalConfiguration(@Nullable LicenseProvisionalConfiguration provisionalConfiguration) {
            this.provisionalConfiguration = provisionalConfiguration;
            return this;
        }

        public Builder renewType(@Nullable String renewType) {
            this.renewType = renewType;
            return this;
        }
        public LicenseConsumptionConfiguration build() {
            return new LicenseConsumptionConfiguration(borrowConfiguration, provisionalConfiguration, renewType);
        }
    }
}

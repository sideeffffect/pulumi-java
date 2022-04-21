// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.licensemanager.inputs;

import com.pulumi.awsnative.licensemanager.inputs.LicenseBorrowConfiguration;
import com.pulumi.awsnative.licensemanager.inputs.LicenseProvisionalConfiguration;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LicenseConsumptionConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final LicenseConsumptionConfiguration Empty = new LicenseConsumptionConfiguration();

    @Import(name="borrowConfiguration")
    private @Nullable LicenseBorrowConfiguration borrowConfiguration;

    public Optional<LicenseBorrowConfiguration> borrowConfiguration() {
        return Optional.ofNullable(this.borrowConfiguration);
    }

    @Import(name="provisionalConfiguration")
    private @Nullable LicenseProvisionalConfiguration provisionalConfiguration;

    public Optional<LicenseProvisionalConfiguration> provisionalConfiguration() {
        return Optional.ofNullable(this.provisionalConfiguration);
    }

    @Import(name="renewType")
    private @Nullable String renewType;

    public Optional<String> renewType() {
        return Optional.ofNullable(this.renewType);
    }

    private LicenseConsumptionConfiguration() {}

    private LicenseConsumptionConfiguration(LicenseConsumptionConfiguration $) {
        this.borrowConfiguration = $.borrowConfiguration;
        this.provisionalConfiguration = $.provisionalConfiguration;
        this.renewType = $.renewType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicenseConsumptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicenseConsumptionConfiguration $;

        public Builder() {
            $ = new LicenseConsumptionConfiguration();
        }

        public Builder(LicenseConsumptionConfiguration defaults) {
            $ = new LicenseConsumptionConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder borrowConfiguration(@Nullable LicenseBorrowConfiguration borrowConfiguration) {
            $.borrowConfiguration = borrowConfiguration;
            return this;
        }

        public Builder provisionalConfiguration(@Nullable LicenseProvisionalConfiguration provisionalConfiguration) {
            $.provisionalConfiguration = provisionalConfiguration;
            return this;
        }

        public Builder renewType(@Nullable String renewType) {
            $.renewType = renewType;
            return this;
        }

        public LicenseConsumptionConfiguration build() {
            return $;
        }
    }

}

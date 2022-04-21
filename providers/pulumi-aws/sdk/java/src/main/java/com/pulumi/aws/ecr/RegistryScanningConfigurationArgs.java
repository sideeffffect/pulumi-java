// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr;

import com.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryScanningConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryScanningConfigurationArgs Empty = new RegistryScanningConfigurationArgs();

    /**
     * One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<RegistryScanningConfigurationRuleArgs>> rules;

    public Optional<Output<List<RegistryScanningConfigurationRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * the scanning type to set for the registry. Can be either `ENHANCED` or `BASIC`.
     * 
     */
    @Import(name="scanType", required=true)
    private Output<String> scanType;

    public Output<String> scanType() {
        return this.scanType;
    }

    private RegistryScanningConfigurationArgs() {}

    private RegistryScanningConfigurationArgs(RegistryScanningConfigurationArgs $) {
        this.rules = $.rules;
        this.scanType = $.scanType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryScanningConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryScanningConfigurationArgs $;

        public Builder() {
            $ = new RegistryScanningConfigurationArgs();
        }

        public Builder(RegistryScanningConfigurationArgs defaults) {
            $ = new RegistryScanningConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder rules(@Nullable Output<List<RegistryScanningConfigurationRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<RegistryScanningConfigurationRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(RegistryScanningConfigurationRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public Builder scanType(Output<String> scanType) {
            $.scanType = scanType;
            return this;
        }

        public Builder scanType(String scanType) {
            return scanType(Output.of(scanType));
        }

        public RegistryScanningConfigurationArgs build() {
            $.scanType = Objects.requireNonNull($.scanType, "expected parameter 'scanType' to be non-null");
            return $;
        }
    }

}

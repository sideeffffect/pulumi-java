// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for Helm operator.
 * 
 */
public final class HelmOperatorPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final HelmOperatorPropertiesArgs Empty = new HelmOperatorPropertiesArgs();

    /**
     * Values override for the operator Helm chart.
     * 
     */
    @Import(name="chartValues")
    private @Nullable Output<String> chartValues;

    public Optional<Output<String>> chartValues() {
        return Optional.ofNullable(this.chartValues);
    }

    /**
     * Version of the operator Helm chart.
     * 
     */
    @Import(name="chartVersion")
    private @Nullable Output<String> chartVersion;

    public Optional<Output<String>> chartVersion() {
        return Optional.ofNullable(this.chartVersion);
    }

    private HelmOperatorPropertiesArgs() {}

    private HelmOperatorPropertiesArgs(HelmOperatorPropertiesArgs $) {
        this.chartValues = $.chartValues;
        this.chartVersion = $.chartVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HelmOperatorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HelmOperatorPropertiesArgs $;

        public Builder() {
            $ = new HelmOperatorPropertiesArgs();
        }

        public Builder(HelmOperatorPropertiesArgs defaults) {
            $ = new HelmOperatorPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder chartValues(@Nullable Output<String> chartValues) {
            $.chartValues = chartValues;
            return this;
        }

        public Builder chartValues(String chartValues) {
            return chartValues(Output.of(chartValues));
        }

        public Builder chartVersion(@Nullable Output<String> chartVersion) {
            $.chartVersion = chartVersion;
            return this;
        }

        public Builder chartVersion(String chartVersion) {
            return chartVersion(Output.of(chartVersion));
        }

        public HelmOperatorPropertiesArgs build() {
            return $;
        }
    }

}

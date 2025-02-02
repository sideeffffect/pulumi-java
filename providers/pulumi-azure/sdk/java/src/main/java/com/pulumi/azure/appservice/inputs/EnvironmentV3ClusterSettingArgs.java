// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EnvironmentV3ClusterSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentV3ClusterSettingArgs Empty = new EnvironmentV3ClusterSettingArgs();

    /**
     * The name of the Cluster Setting.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Cluster Setting.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value for the Cluster Setting.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The value for the Cluster Setting.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private EnvironmentV3ClusterSettingArgs() {}

    private EnvironmentV3ClusterSettingArgs(EnvironmentV3ClusterSettingArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentV3ClusterSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentV3ClusterSettingArgs $;

        public Builder() {
            $ = new EnvironmentV3ClusterSettingArgs();
        }

        public Builder(EnvironmentV3ClusterSettingArgs defaults) {
            $ = new EnvironmentV3ClusterSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Cluster Setting.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Cluster Setting.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value for the Cluster Setting.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value for the Cluster Setting.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EnvironmentV3ClusterSettingArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}

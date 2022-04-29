// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * Information about a parameter used to provision a product.
 * 
 */
public final class ProjectProvisioningParameterArgs extends ResourceArgs {

    public static final ProjectProvisioningParameterArgs Empty = new ProjectProvisioningParameterArgs();

    /**
     * The parameter key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The parameter key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The parameter value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The parameter value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ProjectProvisioningParameterArgs() {}

    private ProjectProvisioningParameterArgs(ProjectProvisioningParameterArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectProvisioningParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectProvisioningParameterArgs $;

        public Builder() {
            $ = new ProjectProvisioningParameterArgs();
        }

        public Builder(ProjectProvisioningParameterArgs defaults) {
            $ = new ProjectProvisioningParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The parameter key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The parameter key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value The parameter value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The parameter value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ProjectProvisioningParameterArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3objectlambda;

import com.pulumi.awsnative.s3objectlambda.inputs.AccessPointObjectLambdaConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPointArgs extends ResourceArgs {

    public static final AccessPointArgs Empty = new AccessPointArgs();

    /**
     * The name you want to assign to this Object lambda Access Point.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name you want to assign to this Object lambda Access Point.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Object lambda Access Point Configuration that configures transformations to be applied on the objects on specified S3 Actions
     * 
     */
    @Import(name="objectLambdaConfiguration", required=true)
    private Output<AccessPointObjectLambdaConfigurationArgs> objectLambdaConfiguration;

    /**
     * @return The Object lambda Access Point Configuration that configures transformations to be applied on the objects on specified S3 Actions
     * 
     */
    public Output<AccessPointObjectLambdaConfigurationArgs> objectLambdaConfiguration() {
        return this.objectLambdaConfiguration;
    }

    private AccessPointArgs() {}

    private AccessPointArgs(AccessPointArgs $) {
        this.name = $.name;
        this.objectLambdaConfiguration = $.objectLambdaConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPointArgs $;

        public Builder() {
            $ = new AccessPointArgs();
        }

        public Builder(AccessPointArgs defaults) {
            $ = new AccessPointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name you want to assign to this Object lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name you want to assign to this Object lambda Access Point.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param objectLambdaConfiguration The Object lambda Access Point Configuration that configures transformations to be applied on the objects on specified S3 Actions
         * 
         * @return builder
         * 
         */
        public Builder objectLambdaConfiguration(Output<AccessPointObjectLambdaConfigurationArgs> objectLambdaConfiguration) {
            $.objectLambdaConfiguration = objectLambdaConfiguration;
            return this;
        }

        /**
         * @param objectLambdaConfiguration The Object lambda Access Point Configuration that configures transformations to be applied on the objects on specified S3 Actions
         * 
         * @return builder
         * 
         */
        public Builder objectLambdaConfiguration(AccessPointObjectLambdaConfigurationArgs objectLambdaConfiguration) {
            return objectLambdaConfiguration(Output.of(objectLambdaConfiguration));
        }

        public AccessPointArgs build() {
            $.objectLambdaConfiguration = Objects.requireNonNull($.objectLambdaConfiguration, "expected parameter 'objectLambdaConfiguration' to be non-null");
            return $;
        }
    }

}

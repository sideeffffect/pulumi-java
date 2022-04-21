// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs Empty = new DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs();

    /**
     * The signing Amazon Web Services Region for IAM authorization.
     * 
     */
    @Import(name="signingRegion")
    private @Nullable Output<String> signingRegion;

    public Optional<Output<String>> signingRegion() {
        return Optional.ofNullable(this.signingRegion);
    }

    /**
     * The signing service name for IAM authorization.
     * 
     */
    @Import(name="signingServiceName")
    private @Nullable Output<String> signingServiceName;

    public Optional<Output<String>> signingServiceName() {
        return Optional.ofNullable(this.signingServiceName);
    }

    private DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs() {}

    private DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs(DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs $) {
        this.signingRegion = $.signingRegion;
        this.signingServiceName = $.signingServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs $;

        public Builder() {
            $ = new DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs();
        }

        public Builder(DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs defaults) {
            $ = new DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder signingRegion(@Nullable Output<String> signingRegion) {
            $.signingRegion = signingRegion;
            return this;
        }

        public Builder signingRegion(String signingRegion) {
            return signingRegion(Output.of(signingRegion));
        }

        public Builder signingServiceName(@Nullable Output<String> signingServiceName) {
            $.signingServiceName = signingServiceName;
            return this;
        }

        public Builder signingServiceName(String signingServiceName) {
            return signingServiceName(Output.of(signingServiceName));
        }

        public DataSourceHttpConfigAuthorizationConfigAwsIamConfigGetArgs build() {
            return $;
        }
    }

}

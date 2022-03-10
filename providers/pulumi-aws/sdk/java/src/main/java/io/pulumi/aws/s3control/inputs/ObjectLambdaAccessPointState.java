// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectLambdaAccessPointState extends io.pulumi.resources.ResourceArgs {

    public static final ObjectLambdaAccessPointState Empty = new ObjectLambdaAccessPointState();

    @InputImport(name="accountId")
      private final @Nullable Input<String> accountId;

    public Input<String> getAccountId() {
        return this.accountId == null ? Input.empty() : this.accountId;
    }

    /**
     * Amazon Resource Name (ARN) of the Object Lambda Access Point.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A configuration block containing details about the Object Lambda Access Point. See Configuration below for more details.
     * 
     */
    @InputImport(name="configuration")
      private final @Nullable Input<ObjectLambdaAccessPointConfigurationGetArgs> configuration;

    public Input<ObjectLambdaAccessPointConfigurationGetArgs> getConfiguration() {
        return this.configuration == null ? Input.empty() : this.configuration;
    }

    /**
     * The name for this Object Lambda Access Point.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ObjectLambdaAccessPointState(
        @Nullable Input<String> accountId,
        @Nullable Input<String> arn,
        @Nullable Input<ObjectLambdaAccessPointConfigurationGetArgs> configuration,
        @Nullable Input<String> name) {
        this.accountId = accountId;
        this.arn = arn;
        this.configuration = configuration;
        this.name = name;
    }

    private ObjectLambdaAccessPointState() {
        this.accountId = Input.empty();
        this.arn = Input.empty();
        this.configuration = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountId;
        private @Nullable Input<String> arn;
        private @Nullable Input<ObjectLambdaAccessPointConfigurationGetArgs> configuration;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.arn = defaults.arn;
    	      this.configuration = defaults.configuration;
    	      this.name = defaults.name;
        }

        public Builder accountId(@Nullable Input<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder accountId(@Nullable String accountId) {
            this.accountId = Input.ofNullable(accountId);
            return this;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder configuration(@Nullable Input<ObjectLambdaAccessPointConfigurationGetArgs> configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder configuration(@Nullable ObjectLambdaAccessPointConfigurationGetArgs configuration) {
            this.configuration = Input.ofNullable(configuration);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public ObjectLambdaAccessPointState build() {
            return new ObjectLambdaAccessPointState(accountId, arn, configuration, name);
        }
    }
}

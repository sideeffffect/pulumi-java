// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena.inputs;

import io.pulumi.aws.athena.inputs.DatabaseEncryptionConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseState extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseState Empty = new DatabaseState();

    /**
     * Name of s3 bucket to save the results of the query execution.
     * 
     */
    @InputImport(name="bucket")
      private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
    }

    /**
     * The encryption key block AWS Athena uses to decrypt the data in S3, such as an AWS Key Management Service (AWS KMS) key. An `encryption_configuration` block is documented below.
     * 
     */
    @InputImport(name="encryptionConfiguration")
      private final @Nullable Input<DatabaseEncryptionConfigurationGetArgs> encryptionConfiguration;

    public Input<DatabaseEncryptionConfigurationGetArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Input.empty() : this.encryptionConfiguration;
    }

    /**
     * A boolean that indicates all tables should be deleted from the database so that the database can be destroyed without error. The tables are *not* recoverable.
     * 
     */
    @InputImport(name="forceDestroy")
      private final @Nullable Input<Boolean> forceDestroy;

    public Input<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Input.empty() : this.forceDestroy;
    }

    /**
     * Name of the database to create.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public DatabaseState(
        @Nullable Input<String> bucket,
        @Nullable Input<DatabaseEncryptionConfigurationGetArgs> encryptionConfiguration,
        @Nullable Input<Boolean> forceDestroy,
        @Nullable Input<String> name) {
        this.bucket = bucket;
        this.encryptionConfiguration = encryptionConfiguration;
        this.forceDestroy = forceDestroy;
        this.name = name;
    }

    private DatabaseState() {
        this.bucket = Input.empty();
        this.encryptionConfiguration = Input.empty();
        this.forceDestroy = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bucket;
        private @Nullable Input<DatabaseEncryptionConfigurationGetArgs> encryptionConfiguration;
        private @Nullable Input<Boolean> forceDestroy;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.name = defaults.name;
        }

        public Builder bucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder bucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
            return this;
        }

        public Builder encryptionConfiguration(@Nullable Input<DatabaseEncryptionConfigurationGetArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder encryptionConfiguration(@Nullable DatabaseEncryptionConfigurationGetArgs encryptionConfiguration) {
            this.encryptionConfiguration = Input.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder forceDestroy(@Nullable Input<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Input.ofNullable(forceDestroy);
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
        public DatabaseState build() {
            return new DatabaseState(bucket, encryptionConfiguration, forceDestroy, name);
        }
    }
}

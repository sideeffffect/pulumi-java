// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DevEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final DevEndpointArgs Empty = new DevEndpointArgs();

    /**
     * A map of arguments used to configure the endpoint.
     * 
     */
    @Import(name="arguments")
      private final @Nullable Output<Map<String,Object>> arguments;

    public Output<Map<String,Object>> arguments() {
        return this.arguments == null ? Codegen.empty() : this.arguments;
    }

    /**
     * Path to one or more Java Jars in an S3 bucket that should be loaded in this endpoint.
     * 
     */
    @Import(name="extraJarsS3Path")
      private final @Nullable Output<String> extraJarsS3Path;

    public Output<String> extraJarsS3Path() {
        return this.extraJarsS3Path == null ? Codegen.empty() : this.extraJarsS3Path;
    }

    /**
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in this endpoint. Multiple values must be complete paths separated by a comma.
     * 
     */
    @Import(name="extraPythonLibsS3Path")
      private final @Nullable Output<String> extraPythonLibsS3Path;

    public Output<String> extraPythonLibsS3Path() {
        return this.extraPythonLibsS3Path == null ? Codegen.empty() : this.extraPythonLibsS3Path;
    }

    /**
     * -  Specifies the versions of Python and Apache Spark to use. Defaults to AWS Glue version 0.9.
     * 
     */
    @Import(name="glueVersion")
      private final @Nullable Output<String> glueVersion;

    public Output<String> glueVersion() {
        return this.glueVersion == null ? Codegen.empty() : this.glueVersion;
    }

    /**
     * The name of this endpoint. It must be unique in your account.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this endpoint. Conflicts with `worker_type`.
     * 
     */
    @Import(name="numberOfNodes")
      private final @Nullable Output<Integer> numberOfNodes;

    public Output<Integer> numberOfNodes() {
        return this.numberOfNodes == null ? Codegen.empty() : this.numberOfNodes;
    }

    /**
     * The number of workers of a defined worker type that are allocated to this endpoint. This field is available only when you choose worker type G.1X or G.2X.
     * 
     */
    @Import(name="numberOfWorkers")
      private final @Nullable Output<Integer> numberOfWorkers;

    public Output<Integer> numberOfWorkers() {
        return this.numberOfWorkers == null ? Codegen.empty() : this.numberOfWorkers;
    }

    /**
     * The public key to be used by this endpoint for authentication.
     * 
     */
    @Import(name="publicKey")
      private final @Nullable Output<String> publicKey;

    public Output<String> publicKey() {
        return this.publicKey == null ? Codegen.empty() : this.publicKey;
    }

    /**
     * A list of public keys to be used by this endpoint for authentication.
     * 
     */
    @Import(name="publicKeys")
      private final @Nullable Output<List<String>> publicKeys;

    public Output<List<String>> publicKeys() {
        return this.publicKeys == null ? Codegen.empty() : this.publicKeys;
    }

    /**
     * The IAM role for this endpoint.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * The name of the Security Configuration structure to be used with this endpoint.
     * 
     */
    @Import(name="securityConfiguration")
      private final @Nullable Output<String> securityConfiguration;

    public Output<String> securityConfiguration() {
        return this.securityConfiguration == null ? Codegen.empty() : this.securityConfiguration;
    }

    /**
     * Security group IDs for the security groups to be used by this endpoint.
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds == null ? Codegen.empty() : this.securityGroupIds;
    }

    /**
     * The subnet ID for the new endpoint to use.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The type of predefined worker that is allocated to this endpoint. Accepts a value of Standard, G.1X, or G.2X.
     * 
     */
    @Import(name="workerType")
      private final @Nullable Output<String> workerType;

    public Output<String> workerType() {
        return this.workerType == null ? Codegen.empty() : this.workerType;
    }

    public DevEndpointArgs(
        @Nullable Output<Map<String,Object>> arguments,
        @Nullable Output<String> extraJarsS3Path,
        @Nullable Output<String> extraPythonLibsS3Path,
        @Nullable Output<String> glueVersion,
        @Nullable Output<String> name,
        @Nullable Output<Integer> numberOfNodes,
        @Nullable Output<Integer> numberOfWorkers,
        @Nullable Output<String> publicKey,
        @Nullable Output<List<String>> publicKeys,
        Output<String> roleArn,
        @Nullable Output<String> securityConfiguration,
        @Nullable Output<List<String>> securityGroupIds,
        @Nullable Output<String> subnetId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> workerType) {
        this.arguments = arguments;
        this.extraJarsS3Path = extraJarsS3Path;
        this.extraPythonLibsS3Path = extraPythonLibsS3Path;
        this.glueVersion = glueVersion;
        this.name = name;
        this.numberOfNodes = numberOfNodes;
        this.numberOfWorkers = numberOfWorkers;
        this.publicKey = publicKey;
        this.publicKeys = publicKeys;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.securityConfiguration = securityConfiguration;
        this.securityGroupIds = securityGroupIds;
        this.subnetId = subnetId;
        this.tags = tags;
        this.workerType = workerType;
    }

    private DevEndpointArgs() {
        this.arguments = Codegen.empty();
        this.extraJarsS3Path = Codegen.empty();
        this.extraPythonLibsS3Path = Codegen.empty();
        this.glueVersion = Codegen.empty();
        this.name = Codegen.empty();
        this.numberOfNodes = Codegen.empty();
        this.numberOfWorkers = Codegen.empty();
        this.publicKey = Codegen.empty();
        this.publicKeys = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.securityConfiguration = Codegen.empty();
        this.securityGroupIds = Codegen.empty();
        this.subnetId = Codegen.empty();
        this.tags = Codegen.empty();
        this.workerType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,Object>> arguments;
        private @Nullable Output<String> extraJarsS3Path;
        private @Nullable Output<String> extraPythonLibsS3Path;
        private @Nullable Output<String> glueVersion;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> numberOfNodes;
        private @Nullable Output<Integer> numberOfWorkers;
        private @Nullable Output<String> publicKey;
        private @Nullable Output<List<String>> publicKeys;
        private Output<String> roleArn;
        private @Nullable Output<String> securityConfiguration;
        private @Nullable Output<List<String>> securityGroupIds;
        private @Nullable Output<String> subnetId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> workerType;

        public Builder() {
    	      // Empty
        }

        public Builder(DevEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.extraJarsS3Path = defaults.extraJarsS3Path;
    	      this.extraPythonLibsS3Path = defaults.extraPythonLibsS3Path;
    	      this.glueVersion = defaults.glueVersion;
    	      this.name = defaults.name;
    	      this.numberOfNodes = defaults.numberOfNodes;
    	      this.numberOfWorkers = defaults.numberOfWorkers;
    	      this.publicKey = defaults.publicKey;
    	      this.publicKeys = defaults.publicKeys;
    	      this.roleArn = defaults.roleArn;
    	      this.securityConfiguration = defaults.securityConfiguration;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.workerType = defaults.workerType;
        }

        public Builder arguments(@Nullable Output<Map<String,Object>> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(@Nullable Map<String,Object> arguments) {
            this.arguments = Codegen.ofNullable(arguments);
            return this;
        }
        public Builder extraJarsS3Path(@Nullable Output<String> extraJarsS3Path) {
            this.extraJarsS3Path = extraJarsS3Path;
            return this;
        }
        public Builder extraJarsS3Path(@Nullable String extraJarsS3Path) {
            this.extraJarsS3Path = Codegen.ofNullable(extraJarsS3Path);
            return this;
        }
        public Builder extraPythonLibsS3Path(@Nullable Output<String> extraPythonLibsS3Path) {
            this.extraPythonLibsS3Path = extraPythonLibsS3Path;
            return this;
        }
        public Builder extraPythonLibsS3Path(@Nullable String extraPythonLibsS3Path) {
            this.extraPythonLibsS3Path = Codegen.ofNullable(extraPythonLibsS3Path);
            return this;
        }
        public Builder glueVersion(@Nullable Output<String> glueVersion) {
            this.glueVersion = glueVersion;
            return this;
        }
        public Builder glueVersion(@Nullable String glueVersion) {
            this.glueVersion = Codegen.ofNullable(glueVersion);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder numberOfNodes(@Nullable Output<Integer> numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            return this;
        }
        public Builder numberOfNodes(@Nullable Integer numberOfNodes) {
            this.numberOfNodes = Codegen.ofNullable(numberOfNodes);
            return this;
        }
        public Builder numberOfWorkers(@Nullable Output<Integer> numberOfWorkers) {
            this.numberOfWorkers = numberOfWorkers;
            return this;
        }
        public Builder numberOfWorkers(@Nullable Integer numberOfWorkers) {
            this.numberOfWorkers = Codegen.ofNullable(numberOfWorkers);
            return this;
        }
        public Builder publicKey(@Nullable Output<String> publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public Builder publicKey(@Nullable String publicKey) {
            this.publicKey = Codegen.ofNullable(publicKey);
            return this;
        }
        public Builder publicKeys(@Nullable Output<List<String>> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }
        public Builder publicKeys(@Nullable List<String> publicKeys) {
            this.publicKeys = Codegen.ofNullable(publicKeys);
            return this;
        }
        public Builder publicKeys(String... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder securityConfiguration(@Nullable Output<String> securityConfiguration) {
            this.securityConfiguration = securityConfiguration;
            return this;
        }
        public Builder securityConfiguration(@Nullable String securityConfiguration) {
            this.securityConfiguration = Codegen.ofNullable(securityConfiguration);
            return this;
        }
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Codegen.ofNullable(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder workerType(@Nullable Output<String> workerType) {
            this.workerType = workerType;
            return this;
        }
        public Builder workerType(@Nullable String workerType) {
            this.workerType = Codegen.ofNullable(workerType);
            return this;
        }        public DevEndpointArgs build() {
            return new DevEndpointArgs(arguments, extraJarsS3Path, extraPythonLibsS3Path, glueVersion, name, numberOfNodes, numberOfWorkers, publicKey, publicKeys, roleArn, securityConfiguration, securityGroupIds, subnetId, tags, workerType);
        }
    }
}

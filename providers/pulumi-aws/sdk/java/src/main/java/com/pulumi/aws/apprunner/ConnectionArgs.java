// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * Name of the connection.
     * 
     */
    @Import(name="connectionName", required=true)
      private final Output<String> connectionName;

    public Output<String> connectionName() {
        return this.connectionName;
    }

    /**
     * The source repository provider. Valid values: `GITHUB`.
     * 
     */
    @Import(name="providerType", required=true)
      private final Output<String> providerType;

    public Output<String> providerType() {
        return this.providerType;
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

    public ConnectionArgs(
        Output<String> connectionName,
        Output<String> providerType,
        @Nullable Output<Map<String,String>> tags) {
        this.connectionName = Objects.requireNonNull(connectionName, "expected parameter 'connectionName' to be non-null");
        this.providerType = Objects.requireNonNull(providerType, "expected parameter 'providerType' to be non-null");
        this.tags = tags;
    }

    private ConnectionArgs() {
        this.connectionName = Codegen.empty();
        this.providerType = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> connectionName;
        private Output<String> providerType;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.providerType = defaults.providerType;
    	      this.tags = defaults.tags;
        }

        public Builder connectionName(Output<String> connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }
        public Builder connectionName(String connectionName) {
            this.connectionName = Output.of(Objects.requireNonNull(connectionName));
            return this;
        }
        public Builder providerType(Output<String> providerType) {
            this.providerType = Objects.requireNonNull(providerType);
            return this;
        }
        public Builder providerType(String providerType) {
            this.providerType = Output.of(Objects.requireNonNull(providerType));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ConnectionArgs build() {
            return new ConnectionArgs(connectionName, providerType, tags);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalNetworkEndpointGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalNetworkEndpointGroupArgs Empty = new GlobalNetworkEndpointGroupArgs();

    /**
     * The default port used if the port number is not specified in the
     * network endpoint.
     * 
     */
    @Import(name="defaultPort")
      private final @Nullable Output<Integer> defaultPort;

    public Output<Integer> defaultPort() {
        return this.defaultPort == null ? Codegen.empty() : this.defaultPort;
    }

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Name of the resource; provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Type of network endpoints in this network endpoint group.
     * Possible values are `INTERNET_IP_PORT` and `INTERNET_FQDN_PORT`.
     * 
     */
    @Import(name="networkEndpointType", required=true)
      private final Output<String> networkEndpointType;

    public Output<String> networkEndpointType() {
        return this.networkEndpointType;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public GlobalNetworkEndpointGroupArgs(
        @Nullable Output<Integer> defaultPort,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<String> networkEndpointType,
        @Nullable Output<String> project) {
        this.defaultPort = defaultPort;
        this.description = description;
        this.name = name;
        this.networkEndpointType = Objects.requireNonNull(networkEndpointType, "expected parameter 'networkEndpointType' to be non-null");
        this.project = project;
    }

    private GlobalNetworkEndpointGroupArgs() {
        this.defaultPort = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.networkEndpointType = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalNetworkEndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> defaultPort;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<String> networkEndpointType;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalNetworkEndpointGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultPort = defaults.defaultPort;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.networkEndpointType = defaults.networkEndpointType;
    	      this.project = defaults.project;
        }

        public Builder defaultPort(@Nullable Output<Integer> defaultPort) {
            this.defaultPort = defaultPort;
            return this;
        }
        public Builder defaultPort(@Nullable Integer defaultPort) {
            this.defaultPort = Codegen.ofNullable(defaultPort);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder networkEndpointType(Output<String> networkEndpointType) {
            this.networkEndpointType = Objects.requireNonNull(networkEndpointType);
            return this;
        }
        public Builder networkEndpointType(String networkEndpointType) {
            this.networkEndpointType = Output.of(Objects.requireNonNull(networkEndpointType));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public GlobalNetworkEndpointGroupArgs build() {
            return new GlobalNetworkEndpointGroupArgs(defaultPort, description, name, networkEndpointType, project);
        }
    }
}

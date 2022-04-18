// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Extra network settings. Only applicable in the App Engine flexible environment.
 * 
 */
public final class NetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkArgs Empty = new NetworkArgs();

    /**
     * List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="forwardedPorts")
      private final @Nullable Output<List<String>> forwardedPorts;

    public Output<List<String>> forwardedPorts() {
        return this.forwardedPorts == null ? Codegen.empty() : this.forwardedPorts;
    }

    /**
     * Tag to apply to the instance during creation. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="instanceTag")
      private final @Nullable Output<String> instanceTag;

    public Output<String> instanceTag() {
        return this.instanceTag == null ? Codegen.empty() : this.instanceTag;
    }

    /**
     * Google Compute Engine network where the virtual machines are created. Specify the short name, not the resource path.Defaults to default.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Enable session affinity. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="sessionAffinity")
      private final @Nullable Output<Boolean> sessionAffinity;

    public Output<Boolean> sessionAffinity() {
        return this.sessionAffinity == null ? Codegen.empty() : this.sessionAffinity;
    }

    /**
     * Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.If a subnetwork name is specified, a network name will also be required unless it is for the default network. If the network that the instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range. If the network that the instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network. If the network that the instance is being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified and the IP address is created from the IPCidrRange of the subnetwork.If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
     * 
     */
    @Import(name="subnetworkName")
      private final @Nullable Output<String> subnetworkName;

    public Output<String> subnetworkName() {
        return this.subnetworkName == null ? Codegen.empty() : this.subnetworkName;
    }

    public NetworkArgs(
        @Nullable Output<List<String>> forwardedPorts,
        @Nullable Output<String> instanceTag,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> sessionAffinity,
        @Nullable Output<String> subnetworkName) {
        this.forwardedPorts = forwardedPorts;
        this.instanceTag = instanceTag;
        this.name = name;
        this.sessionAffinity = sessionAffinity;
        this.subnetworkName = subnetworkName;
    }

    private NetworkArgs() {
        this.forwardedPorts = Codegen.empty();
        this.instanceTag = Codegen.empty();
        this.name = Codegen.empty();
        this.sessionAffinity = Codegen.empty();
        this.subnetworkName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> forwardedPorts;
        private @Nullable Output<String> instanceTag;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> sessionAffinity;
        private @Nullable Output<String> subnetworkName;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardedPorts = defaults.forwardedPorts;
    	      this.instanceTag = defaults.instanceTag;
    	      this.name = defaults.name;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.subnetworkName = defaults.subnetworkName;
        }

        public Builder forwardedPorts(@Nullable Output<List<String>> forwardedPorts) {
            this.forwardedPorts = forwardedPorts;
            return this;
        }
        public Builder forwardedPorts(@Nullable List<String> forwardedPorts) {
            this.forwardedPorts = Codegen.ofNullable(forwardedPorts);
            return this;
        }
        public Builder forwardedPorts(String... forwardedPorts) {
            return forwardedPorts(List.of(forwardedPorts));
        }
        public Builder instanceTag(@Nullable Output<String> instanceTag) {
            this.instanceTag = instanceTag;
            return this;
        }
        public Builder instanceTag(@Nullable String instanceTag) {
            this.instanceTag = Codegen.ofNullable(instanceTag);
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
        public Builder sessionAffinity(@Nullable Output<Boolean> sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }
        public Builder sessionAffinity(@Nullable Boolean sessionAffinity) {
            this.sessionAffinity = Codegen.ofNullable(sessionAffinity);
            return this;
        }
        public Builder subnetworkName(@Nullable Output<String> subnetworkName) {
            this.subnetworkName = subnetworkName;
            return this;
        }
        public Builder subnetworkName(@Nullable String subnetworkName) {
            this.subnetworkName = Codegen.ofNullable(subnetworkName);
            return this;
        }        public NetworkArgs build() {
            return new NetworkArgs(forwardedPorts, instanceTag, name, sessionAffinity, subnetworkName);
        }
    }
}

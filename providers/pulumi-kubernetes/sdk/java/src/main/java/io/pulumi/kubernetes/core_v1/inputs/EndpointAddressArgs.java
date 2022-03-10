// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EndpointAddress is a tuple that describes single IP address.
 * 
 */
public final class EndpointAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointAddressArgs Empty = new EndpointAddressArgs();

    /**
     * The Hostname of this endpoint
     * 
     */
    @InputImport(name="hostname")
      private final @Nullable Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname == null ? Input.empty() : this.hostname;
    }

    /**
     * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also accepted but not fully supported on all platforms. Also, certain kubernetes components, like kube-proxy, are not IPv6 ready.
     * 
     */
    @InputImport(name="ip", required=true)
      private final Input<String> ip;

    public Input<String> getIp() {
        return this.ip;
    }

    /**
     * Optional: Node hosting this endpoint. This can be used to determine endpoints local to a node.
     * 
     */
    @InputImport(name="nodeName")
      private final @Nullable Input<String> nodeName;

    public Input<String> getNodeName() {
        return this.nodeName == null ? Input.empty() : this.nodeName;
    }

    /**
     * Reference to object providing the endpoint.
     * 
     */
    @InputImport(name="targetRef")
      private final @Nullable Input<ObjectReferenceArgs> targetRef;

    public Input<ObjectReferenceArgs> getTargetRef() {
        return this.targetRef == null ? Input.empty() : this.targetRef;
    }

    public EndpointAddressArgs(
        @Nullable Input<String> hostname,
        Input<String> ip,
        @Nullable Input<String> nodeName,
        @Nullable Input<ObjectReferenceArgs> targetRef) {
        this.hostname = hostname;
        this.ip = Objects.requireNonNull(ip, "expected parameter 'ip' to be non-null");
        this.nodeName = nodeName;
        this.targetRef = targetRef;
    }

    private EndpointAddressArgs() {
        this.hostname = Input.empty();
        this.ip = Input.empty();
        this.nodeName = Input.empty();
        this.targetRef = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hostname;
        private Input<String> ip;
        private @Nullable Input<String> nodeName;
        private @Nullable Input<ObjectReferenceArgs> targetRef;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.ip = defaults.ip;
    	      this.nodeName = defaults.nodeName;
    	      this.targetRef = defaults.targetRef;
        }

        public Builder hostname(@Nullable Input<String> hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder hostname(@Nullable String hostname) {
            this.hostname = Input.ofNullable(hostname);
            return this;
        }

        public Builder ip(Input<String> ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }

        public Builder ip(String ip) {
            this.ip = Input.of(Objects.requireNonNull(ip));
            return this;
        }

        public Builder nodeName(@Nullable Input<String> nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        public Builder nodeName(@Nullable String nodeName) {
            this.nodeName = Input.ofNullable(nodeName);
            return this;
        }

        public Builder targetRef(@Nullable Input<ObjectReferenceArgs> targetRef) {
            this.targetRef = targetRef;
            return this;
        }

        public Builder targetRef(@Nullable ObjectReferenceArgs targetRef) {
            this.targetRef = Input.ofNullable(targetRef);
            return this;
        }
        public EndpointAddressArgs build() {
            return new EndpointAddressArgs(hostname, ip, nodeName, targetRef);
        }
    }
}

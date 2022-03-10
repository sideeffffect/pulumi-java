// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class IpSetIpSetDescriptorArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpSetIpSetDescriptorArgs Empty = new IpSetIpSetDescriptorArgs();

    /**
     * Type of the IP address - `IPV4` or `IPV6`.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * An IPv4 or IPv6 address specified via CIDR notationE.g., `192.0.2.44/32` or `1111:0000:0000:0000:0000:0000:0000:0000/64`
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public IpSetIpSetDescriptorArgs(
        Input<String> type,
        Input<String> value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private IpSetIpSetDescriptorArgs() {
        this.type = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpSetIpSetDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> type;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(IpSetIpSetDescriptorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder value(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public IpSetIpSetDescriptorArgs build() {
            return new IpSetIpSetDescriptorArgs(type, value);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IpSetIpSetDescriptor {
    /**
     * Type of the IP address - `IPV4` or `IPV6`.
     * 
     */
    private final String type;
    /**
     * An IPv4 or IPv6 address specified via CIDR notationE.g., `192.0.2.44/32` or `1111:0000:0000:0000:0000:0000:0000:0000/64`
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"type","value"})
    private IpSetIpSetDescriptor(
        String type,
        String value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Type of the IP address - `IPV4` or `IPV6`.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * An IPv4 or IPv6 address specified via CIDR notationE.g., `192.0.2.44/32` or `1111:0000:0000:0000:0000:0000:0000:0000/64`
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpSetIpSetDescriptor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(IpSetIpSetDescriptor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public IpSetIpSetDescriptor build() {
            return new IpSetIpSetDescriptor(type, value);
        }
    }
}

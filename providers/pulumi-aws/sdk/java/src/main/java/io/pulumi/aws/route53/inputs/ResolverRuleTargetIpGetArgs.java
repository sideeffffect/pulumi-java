// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverRuleTargetIpGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverRuleTargetIpGetArgs Empty = new ResolverRuleTargetIpGetArgs();

    /**
     * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
     * 
     */
    @InputImport(name="ip", required=true)
      private final Input<String> ip;

    public Input<String> getIp() {
        return this.ip;
    }

    /**
     * The port at `ip` that you want to forward DNS queries to. Default value is `53`
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    public ResolverRuleTargetIpGetArgs(
        Input<String> ip,
        @Nullable Input<Integer> port) {
        this.ip = Objects.requireNonNull(ip, "expected parameter 'ip' to be non-null");
        this.port = port;
    }

    private ResolverRuleTargetIpGetArgs() {
        this.ip = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverRuleTargetIpGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ip;
        private @Nullable Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverRuleTargetIpGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ip = defaults.ip;
    	      this.port = defaults.port;
        }

        public Builder ip(Input<String> ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }

        public Builder ip(String ip) {
            this.ip = Input.of(Objects.requireNonNull(ip));
            return this;
        }

        public Builder port(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }
        public ResolverRuleTargetIpGetArgs build() {
            return new ResolverRuleTargetIpGetArgs(ip, port);
        }
    }
}

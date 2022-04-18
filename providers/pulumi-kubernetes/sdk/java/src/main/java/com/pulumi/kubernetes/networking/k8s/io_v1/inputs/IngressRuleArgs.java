// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.networking.k8s.io_v1.inputs.HTTPIngressRuleValueArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IngressRule represents the rules mapping the paths under a specified host to the related backend services. Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.
 * 
 */
public final class IngressRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressRuleArgs Empty = new IngressRuleArgs();

    /**
     * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the "host" part of the URI as defined in RFC 3986: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to
     *    the IP in the Spec of the parent Ingress.
     * 2. The `:` delimiter is not respected because ports are not allowed.
     * 	  Currently the port of an Ingress is implicitly :80 for http and
     * 	  :443 for https.
     * Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
     * 
     * Host can be "precise" which is a domain name without the terminating dot of a network host (e.g. "foo.bar.com") or "wildcard", which is a domain name prefixed with a single wildcard label (e.g. "*.foo.com"). The wildcard character '*' must appear by itself as the first DNS label and matches only a single label. You cannot have a wildcard label by itself (e.g. Host == "*"). Requests will be matched against the Host field in the following way: 1. If Host is precise, the request matches this rule if the http host header is equal to Host. 2. If Host is a wildcard, then the request matches this rule if the http host header is to equal to the suffix (removing the first label) of the wildcard rule.
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> host() {
        return this.host == null ? Codegen.empty() : this.host;
    }

    @Import(name="http")
      private final @Nullable Output<HTTPIngressRuleValueArgs> http;

    public Output<HTTPIngressRuleValueArgs> http() {
        return this.http == null ? Codegen.empty() : this.http;
    }

    public IngressRuleArgs(
        @Nullable Output<String> host,
        @Nullable Output<HTTPIngressRuleValueArgs> http) {
        this.host = host;
        this.http = http;
    }

    private IngressRuleArgs() {
        this.host = Codegen.empty();
        this.http = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> host;
        private @Nullable Output<HTTPIngressRuleValueArgs> http;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.http = defaults.http;
        }

        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = Codegen.ofNullable(host);
            return this;
        }
        public Builder http(@Nullable Output<HTTPIngressRuleValueArgs> http) {
            this.http = http;
            return this;
        }
        public Builder http(@Nullable HTTPIngressRuleValueArgs http) {
            this.http = Codegen.ofNullable(http);
            return this;
        }        public IngressRuleArgs build() {
            return new IngressRuleArgs(host, http);
        }
    }
}

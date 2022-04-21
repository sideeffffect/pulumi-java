// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.HTTPIngressRuleValueArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IngressRule represents the rules mapping the paths under a specified host to the related backend services. Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.
 * 
 */
public final class IngressRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressRuleArgs Empty = new IngressRuleArgs();

    /**
     * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the &#34;host&#34; part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the
     * 	  IP in the Spec of the parent Ingress.
     * 2. The `:` delimiter is not respected because ports are not allowed.
     * 	  Currently the port of an Ingress is implicitly :80 for http and
     * 	  :443 for https.
     * Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    @Import(name="http")
    private @Nullable Output<HTTPIngressRuleValueArgs> http;

    public Optional<Output<HTTPIngressRuleValueArgs>> http() {
        return Optional.ofNullable(this.http);
    }

    private IngressRuleArgs() {}

    private IngressRuleArgs(IngressRuleArgs $) {
        this.host = $.host;
        this.http = $.http;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressRuleArgs $;

        public Builder() {
            $ = new IngressRuleArgs();
        }

        public Builder(IngressRuleArgs defaults) {
            $ = new IngressRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder http(@Nullable Output<HTTPIngressRuleValueArgs> http) {
            $.http = http;
            return this;
        }

        public Builder http(HTTPIngressRuleValueArgs http) {
            return http(Output.of(http));
        }

        public IngressRuleArgs build() {
            return $;
        }
    }

}

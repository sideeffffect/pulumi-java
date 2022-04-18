// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.IngressBackendArgs;
import com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.IngressRuleArgs;
import com.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs.IngressTLSArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IngressSpec describes the Ingress the user wishes to exist.
 * 
 */
public final class IngressSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressSpecArgs Empty = new IngressSpecArgs();

    /**
     * A default backend capable of servicing requests that don't match any rule. At least one of 'backend' or 'rules' must be specified. This field is optional to allow the loadbalancer controller or defaulting logic to specify a global default.
     * 
     */
    @Import(name="backend")
      private final @Nullable Output<IngressBackendArgs> backend;

    public Output<IngressBackendArgs> backend() {
        return this.backend == null ? Codegen.empty() : this.backend;
    }

    /**
     * IngressClassName is the name of the IngressClass cluster resource. The associated IngressClass defines which controller will implement the resource. This replaces the deprecated `kubernetes.io/ingress.class` annotation. For backwards compatibility, when that annotation is set, it must be given precedence over this field. The controller may emit a warning if the field and annotation have different values. Implementations of this API should ignore Ingresses without a class specified. An IngressClass resource may be marked as default, which can be used to set a default value for this field. For more information, refer to the IngressClass documentation.
     * 
     */
    @Import(name="ingressClassName")
      private final @Nullable Output<String> ingressClassName;

    public Output<String> ingressClassName() {
        return this.ingressClassName == null ? Codegen.empty() : this.ingressClassName;
    }

    /**
     * A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<IngressRuleArgs>> rules;

    public Output<List<IngressRuleArgs>> rules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    /**
     * TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI.
     * 
     */
    @Import(name="tls")
      private final @Nullable Output<List<IngressTLSArgs>> tls;

    public Output<List<IngressTLSArgs>> tls() {
        return this.tls == null ? Codegen.empty() : this.tls;
    }

    public IngressSpecArgs(
        @Nullable Output<IngressBackendArgs> backend,
        @Nullable Output<String> ingressClassName,
        @Nullable Output<List<IngressRuleArgs>> rules,
        @Nullable Output<List<IngressTLSArgs>> tls) {
        this.backend = backend;
        this.ingressClassName = ingressClassName;
        this.rules = rules;
        this.tls = tls;
    }

    private IngressSpecArgs() {
        this.backend = Codegen.empty();
        this.ingressClassName = Codegen.empty();
        this.rules = Codegen.empty();
        this.tls = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IngressBackendArgs> backend;
        private @Nullable Output<String> ingressClassName;
        private @Nullable Output<List<IngressRuleArgs>> rules;
        private @Nullable Output<List<IngressTLSArgs>> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backend = defaults.backend;
    	      this.ingressClassName = defaults.ingressClassName;
    	      this.rules = defaults.rules;
    	      this.tls = defaults.tls;
        }

        public Builder backend(@Nullable Output<IngressBackendArgs> backend) {
            this.backend = backend;
            return this;
        }
        public Builder backend(@Nullable IngressBackendArgs backend) {
            this.backend = Codegen.ofNullable(backend);
            return this;
        }
        public Builder ingressClassName(@Nullable Output<String> ingressClassName) {
            this.ingressClassName = ingressClassName;
            return this;
        }
        public Builder ingressClassName(@Nullable String ingressClassName) {
            this.ingressClassName = Codegen.ofNullable(ingressClassName);
            return this;
        }
        public Builder rules(@Nullable Output<List<IngressRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<IngressRuleArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(IngressRuleArgs... rules) {
            return rules(List.of(rules));
        }
        public Builder tls(@Nullable Output<List<IngressTLSArgs>> tls) {
            this.tls = tls;
            return this;
        }
        public Builder tls(@Nullable List<IngressTLSArgs> tls) {
            this.tls = Codegen.ofNullable(tls);
            return this;
        }
        public Builder tls(IngressTLSArgs... tls) {
            return tls(List.of(tls));
        }        public IngressSpecArgs build() {
            return new IngressSpecArgs(backend, ingressClassName, rules, tls);
        }
    }
}

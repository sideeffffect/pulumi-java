// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.outputs;

import io.pulumi.aws.elasticloadbalancingv2.outputs.GetListenerDefaultAction;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetListenerResult {
    private final String alpnPolicy;
    private final String arn;
    private final String certificateArn;
    private final List<GetListenerDefaultAction> defaultActions;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String loadBalancerArn;
    private final Integer port;
    private final String protocol;
    private final String sslPolicy;
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetListenerResult(
        @CustomType.Parameter("alpnPolicy") String alpnPolicy,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("certificateArn") String certificateArn,
        @CustomType.Parameter("defaultActions") List<GetListenerDefaultAction> defaultActions,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("loadBalancerArn") String loadBalancerArn,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("sslPolicy") String sslPolicy,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.alpnPolicy = alpnPolicy;
        this.arn = arn;
        this.certificateArn = certificateArn;
        this.defaultActions = defaultActions;
        this.id = id;
        this.loadBalancerArn = loadBalancerArn;
        this.port = port;
        this.protocol = protocol;
        this.sslPolicy = sslPolicy;
        this.tags = tags;
    }

    public String alpnPolicy() {
        return this.alpnPolicy;
    }
    public String arn() {
        return this.arn;
    }
    public String certificateArn() {
        return this.certificateArn;
    }
    public List<GetListenerDefaultAction> defaultActions() {
        return this.defaultActions;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public String loadBalancerArn() {
        return this.loadBalancerArn;
    }
    public Integer port() {
        return this.port;
    }
    public String protocol() {
        return this.protocol;
    }
    public String sslPolicy() {
        return this.sslPolicy;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alpnPolicy;
        private String arn;
        private String certificateArn;
        private List<GetListenerDefaultAction> defaultActions;
        private String id;
        private String loadBalancerArn;
        private Integer port;
        private String protocol;
        private String sslPolicy;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alpnPolicy = defaults.alpnPolicy;
    	      this.arn = defaults.arn;
    	      this.certificateArn = defaults.certificateArn;
    	      this.defaultActions = defaults.defaultActions;
    	      this.id = defaults.id;
    	      this.loadBalancerArn = defaults.loadBalancerArn;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.tags = defaults.tags;
        }

        public Builder alpnPolicy(String alpnPolicy) {
            this.alpnPolicy = Objects.requireNonNull(alpnPolicy);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder certificateArn(String certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }
        public Builder defaultActions(List<GetListenerDefaultAction> defaultActions) {
            this.defaultActions = Objects.requireNonNull(defaultActions);
            return this;
        }
        public Builder defaultActions(GetListenerDefaultAction... defaultActions) {
            return defaultActions(List.of(defaultActions));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder loadBalancerArn(String loadBalancerArn) {
            this.loadBalancerArn = Objects.requireNonNull(loadBalancerArn);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder sslPolicy(String sslPolicy) {
            this.sslPolicy = Objects.requireNonNull(sslPolicy);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetListenerResult build() {
            return new GetListenerResult(alpnPolicy, arn, certificateArn, defaultActions, id, loadBalancerArn, port, protocol, sslPolicy, tags);
        }
    }
}

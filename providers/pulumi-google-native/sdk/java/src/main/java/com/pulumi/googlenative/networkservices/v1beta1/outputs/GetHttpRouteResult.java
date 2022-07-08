// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkservices.v1beta1.outputs.HttpRouteRouteRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetHttpRouteResult {
    /**
     * @return The timestamp when the resource was created.
     * 
     */
    private final String createTime;
    /**
     * @return Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    private final String description;
    /**
     * @return Optional. Gateways defines a list of gateways this HttpRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/*{@literal /}locations/global/gateways/`
     * 
     */
    private final List<String> gateways;
    /**
     * @return Hostnames define a set of hosts that should match against the HTTP host header to select a HttpRoute to process the request. Hostname is the fully qualified domain name of a network host, as defined by RFC 1123 with the exception that: - IPs are not allowed. - A hostname may be prefixed with a wildcard label (*.). The wildcard label must appear by itself as the first label. Hostname can be &#34;precise&#34; which is a domain name without the terminating dot of a network host (e.g. &#34;foo.example.com&#34;) or &#34;wildcard&#34;, which is a domain name prefixed with a single wildcard label (e.g. *.example.com). Note that as per RFC1035 and RFC1123, a label must consist of lower case alphanumeric characters or &#39;-&#39;, and must start and end with an alphanumeric character. No other punctuation is allowed. The routes associated with a Mesh or Gateways must have unique hostnames. If you attempt to attach multiple routes with conflicting hostnames, the configuration will be rejected. For example, while it is acceptable for routes for the hostnames &#34;*.foo.bar.com&#34; and &#34;*.bar.com&#34; to be associated with the same Mesh (or Gateways under the same scope), it is not possible to associate two routes both with &#34;*.bar.com&#34; or both with &#34;bar.com&#34;.
     * 
     */
    private final List<String> hostnames;
    /**
     * @return Optional. Set of label tags associated with the HttpRoute resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Optional. Meshes defines a list of meshes this HttpRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/*{@literal /}locations/global/meshes/` The attached Mesh should be of a type SIDECAR
     * 
     */
    private final List<String> meshes;
    /**
     * @return Name of the HttpRoute resource. It matches pattern `projects/*{@literal /}locations/global/httpRoutes/http_route_name&gt;`.
     * 
     */
    private final String name;
    /**
     * @return Rules that define how traffic is routed and handled. Rules will be matched sequentially based on the RouteMatch specified for the rule.
     * 
     */
    private final List<HttpRouteRouteRuleResponse> rules;
    /**
     * @return Server-defined URL of this resource
     * 
     */
    private final String selfLink;
    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetHttpRouteResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("gateways") List<String> gateways,
        @CustomType.Parameter("hostnames") List<String> hostnames,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("meshes") List<String> meshes,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("rules") List<HttpRouteRouteRuleResponse> rules,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.gateways = gateways;
        this.hostnames = hostnames;
        this.labels = labels;
        this.meshes = meshes;
        this.name = name;
        this.rules = rules;
        this.selfLink = selfLink;
        this.updateTime = updateTime;
    }

    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. Gateways defines a list of gateways this HttpRoute is attached to, as one of the routing rules to route the requests served by the gateway. Each gateway reference should match the pattern: `projects/*{@literal /}locations/global/gateways/`
     * 
     */
    public List<String> gateways() {
        return this.gateways;
    }
    /**
     * @return Hostnames define a set of hosts that should match against the HTTP host header to select a HttpRoute to process the request. Hostname is the fully qualified domain name of a network host, as defined by RFC 1123 with the exception that: - IPs are not allowed. - A hostname may be prefixed with a wildcard label (*.). The wildcard label must appear by itself as the first label. Hostname can be &#34;precise&#34; which is a domain name without the terminating dot of a network host (e.g. &#34;foo.example.com&#34;) or &#34;wildcard&#34;, which is a domain name prefixed with a single wildcard label (e.g. *.example.com). Note that as per RFC1035 and RFC1123, a label must consist of lower case alphanumeric characters or &#39;-&#39;, and must start and end with an alphanumeric character. No other punctuation is allowed. The routes associated with a Mesh or Gateways must have unique hostnames. If you attempt to attach multiple routes with conflicting hostnames, the configuration will be rejected. For example, while it is acceptable for routes for the hostnames &#34;*.foo.bar.com&#34; and &#34;*.bar.com&#34; to be associated with the same Mesh (or Gateways under the same scope), it is not possible to associate two routes both with &#34;*.bar.com&#34; or both with &#34;bar.com&#34;.
     * 
     */
    public List<String> hostnames() {
        return this.hostnames;
    }
    /**
     * @return Optional. Set of label tags associated with the HttpRoute resource.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Optional. Meshes defines a list of meshes this HttpRoute is attached to, as one of the routing rules to route the requests served by the mesh. Each mesh reference should match the pattern: `projects/*{@literal /}locations/global/meshes/` The attached Mesh should be of a type SIDECAR
     * 
     */
    public List<String> meshes() {
        return this.meshes;
    }
    /**
     * @return Name of the HttpRoute resource. It matches pattern `projects/*{@literal /}locations/global/httpRoutes/http_route_name&gt;`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Rules that define how traffic is routed and handled. Rules will be matched sequentially based on the RouteMatch specified for the rule.
     * 
     */
    public List<HttpRouteRouteRuleResponse> rules() {
        return this.rules;
    }
    /**
     * @return Server-defined URL of this resource
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHttpRouteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private List<String> gateways;
        private List<String> hostnames;
        private Map<String,String> labels;
        private List<String> meshes;
        private String name;
        private List<HttpRouteRouteRuleResponse> rules;
        private String selfLink;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHttpRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.gateways = defaults.gateways;
    	      this.hostnames = defaults.hostnames;
    	      this.labels = defaults.labels;
    	      this.meshes = defaults.meshes;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.selfLink = defaults.selfLink;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder gateways(List<String> gateways) {
            this.gateways = Objects.requireNonNull(gateways);
            return this;
        }
        public Builder gateways(String... gateways) {
            return gateways(List.of(gateways));
        }
        public Builder hostnames(List<String> hostnames) {
            this.hostnames = Objects.requireNonNull(hostnames);
            return this;
        }
        public Builder hostnames(String... hostnames) {
            return hostnames(List.of(hostnames));
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder meshes(List<String> meshes) {
            this.meshes = Objects.requireNonNull(meshes);
            return this;
        }
        public Builder meshes(String... meshes) {
            return meshes(List.of(meshes));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder rules(List<HttpRouteRouteRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(HttpRouteRouteRuleResponse... rules) {
            return rules(List.of(rules));
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetHttpRouteResult build() {
            return new GetHttpRouteResult(createTime, description, gateways, hostnames, labels, meshes, name, rules, selfLink, updateTime);
        }
    }
}

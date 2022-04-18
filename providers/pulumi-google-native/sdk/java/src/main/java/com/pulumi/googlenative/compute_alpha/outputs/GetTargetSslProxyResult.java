// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTargetSslProxyResult {
    /**
     * URL of a certificate map that identifies a certificate map associated with the given target proxy. This field can only be set for global target proxies. If set, sslCertificates will be ignored.
     * 
     */
    private final String certificateMap;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Type of the resource. Always compute#targetSslProxy for target SSL proxies.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    private final String proxyHeader;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * URL to the BackendService resource.
     * 
     */
    private final String service;
    /**
     * URLs to SslCertificate resources that are used to authenticate connections to Backends. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    private final List<String> sslCertificates;
    /**
     * URL of SslPolicy resource that will be associated with the TargetSslProxy resource. If not set, the TargetSslProxy resource will not have any SSL policy configured.
     * 
     */
    private final String sslPolicy;

    @CustomType.Constructor
    private GetTargetSslProxyResult(
        @CustomType.Parameter("certificateMap") String certificateMap,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("proxyHeader") String proxyHeader,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("service") String service,
        @CustomType.Parameter("sslCertificates") List<String> sslCertificates,
        @CustomType.Parameter("sslPolicy") String sslPolicy) {
        this.certificateMap = certificateMap;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.kind = kind;
        this.name = name;
        this.proxyHeader = proxyHeader;
        this.selfLink = selfLink;
        this.service = service;
        this.sslCertificates = sslCertificates;
        this.sslPolicy = sslPolicy;
    }

    /**
     * URL of a certificate map that identifies a certificate map associated with the given target proxy. This field can only be set for global target proxies. If set, sslCertificates will be ignored.
     * 
    */
    public String certificateMap() {
        return this.certificateMap;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Type of the resource. Always compute#targetSslProxy for target SSL proxies.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
    */
    public String proxyHeader() {
        return this.proxyHeader;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * URL to the BackendService resource.
     * 
    */
    public String service() {
        return this.service;
    }
    /**
     * URLs to SslCertificate resources that are used to authenticate connections to Backends. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * 
    */
    public List<String> sslCertificates() {
        return this.sslCertificates;
    }
    /**
     * URL of SslPolicy resource that will be associated with the TargetSslProxy resource. If not set, the TargetSslProxy resource will not have any SSL policy configured.
     * 
    */
    public String sslPolicy() {
        return this.sslPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetSslProxyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateMap;
        private String creationTimestamp;
        private String description;
        private String kind;
        private String name;
        private String proxyHeader;
        private String selfLink;
        private String service;
        private List<String> sslCertificates;
        private String sslPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetSslProxyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateMap = defaults.certificateMap;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.selfLink = defaults.selfLink;
    	      this.service = defaults.service;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
        }

        public Builder certificateMap(String certificateMap) {
            this.certificateMap = Objects.requireNonNull(certificateMap);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder proxyHeader(String proxyHeader) {
            this.proxyHeader = Objects.requireNonNull(proxyHeader);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public Builder sslCertificates(List<String> sslCertificates) {
            this.sslCertificates = Objects.requireNonNull(sslCertificates);
            return this;
        }
        public Builder sslCertificates(String... sslCertificates) {
            return sslCertificates(List.of(sslCertificates));
        }
        public Builder sslPolicy(String sslPolicy) {
            this.sslPolicy = Objects.requireNonNull(sslPolicy);
            return this;
        }        public GetTargetSslProxyResult build() {
            return new GetTargetSslProxyResult(certificateMap, creationTimestamp, description, kind, name, proxyHeader, selfLink, service, sslCertificates, sslPolicy);
        }
    }
}

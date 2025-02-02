// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.certificatemanager_v1.outputs.DnsResourceRecordResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDnsAuthorizationResult {
    /**
     * @return The creation timestamp of a DnsAuthorization.
     * 
     */
    private final String createTime;
    /**
     * @return One or more paragraphs of text description of a DnsAuthorization.
     * 
     */
    private final String description;
    /**
     * @return DNS Resource Record that needs to be added to DNS configuration.
     * 
     */
    private final DnsResourceRecordResponse dnsResourceRecord;
    /**
     * @return Immutable. A domain which is being authorized. A DnsAuthorization resource covers a single domain and its wildcard, e.g. authorization for `example.com` can be used to issue certificates for `example.com` and `*.example.com`.
     * 
     */
    private final String domain;
    /**
     * @return Set of labels associated with a DnsAuthorization.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return A user-defined name of the dns authorization. DnsAuthorization names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}dnsAuthorizations/*`.
     * 
     */
    private final String name;
    /**
     * @return The last update timestamp of a DnsAuthorization.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetDnsAuthorizationResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("dnsResourceRecord") DnsResourceRecordResponse dnsResourceRecord,
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.dnsResourceRecord = dnsResourceRecord;
        this.domain = domain;
        this.labels = labels;
        this.name = name;
        this.updateTime = updateTime;
    }

    /**
     * @return The creation timestamp of a DnsAuthorization.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return One or more paragraphs of text description of a DnsAuthorization.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return DNS Resource Record that needs to be added to DNS configuration.
     * 
     */
    public DnsResourceRecordResponse dnsResourceRecord() {
        return this.dnsResourceRecord;
    }
    /**
     * @return Immutable. A domain which is being authorized. A DnsAuthorization resource covers a single domain and its wildcard, e.g. authorization for `example.com` can be used to issue certificates for `example.com` and `*.example.com`.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return Set of labels associated with a DnsAuthorization.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return A user-defined name of the dns authorization. DnsAuthorization names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}dnsAuthorizations/*`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The last update timestamp of a DnsAuthorization.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDnsAuthorizationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private DnsResourceRecordResponse dnsResourceRecord;
        private String domain;
        private Map<String,String> labels;
        private String name;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDnsAuthorizationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.dnsResourceRecord = defaults.dnsResourceRecord;
    	      this.domain = defaults.domain;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
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
        public Builder dnsResourceRecord(DnsResourceRecordResponse dnsResourceRecord) {
            this.dnsResourceRecord = Objects.requireNonNull(dnsResourceRecord);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetDnsAuthorizationResult build() {
            return new GetDnsAuthorizationResult(createTime, description, dnsResourceRecord, domain, labels, name, updateTime);
        }
    }
}

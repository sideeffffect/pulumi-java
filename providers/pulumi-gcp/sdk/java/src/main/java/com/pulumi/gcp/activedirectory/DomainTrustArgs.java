// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.activedirectory;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainTrustArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainTrustArgs Empty = new DomainTrustArgs();

    /**
     * The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
     * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
     * 
     */
    @Import(name="selectiveAuthentication")
    private @Nullable Output<Boolean> selectiveAuthentication;

    public Optional<Output<Boolean>> selectiveAuthentication() {
        return Optional.ofNullable(this.selectiveAuthentication);
    }

    /**
     * The target DNS server IP addresses which can resolve the remote domain involved in the trust.
     * 
     */
    @Import(name="targetDnsIpAddresses", required=true)
    private Output<List<String>> targetDnsIpAddresses;

    public Output<List<String>> targetDnsIpAddresses() {
        return this.targetDnsIpAddresses;
    }

    /**
     * The fully qualified target domain name which will be in trust with the current domain.
     * 
     */
    @Import(name="targetDomainName", required=true)
    private Output<String> targetDomainName;

    public Output<String> targetDomainName() {
        return this.targetDomainName;
    }

    /**
     * The trust direction, which decides if the current domain is trusted, trusting, or both.
     * Possible values are `INBOUND`, `OUTBOUND`, and `BIDIRECTIONAL`.
     * 
     */
    @Import(name="trustDirection", required=true)
    private Output<String> trustDirection;

    public Output<String> trustDirection() {
        return this.trustDirection;
    }

    /**
     * The trust secret used for the handshake with the target domain. This will not be stored.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="trustHandshakeSecret", required=true)
    private Output<String> trustHandshakeSecret;

    public Output<String> trustHandshakeSecret() {
        return this.trustHandshakeSecret;
    }

    /**
     * The type of trust represented by the trust resource.
     * Possible values are `FOREST` and `EXTERNAL`.
     * 
     */
    @Import(name="trustType", required=true)
    private Output<String> trustType;

    public Output<String> trustType() {
        return this.trustType;
    }

    private DomainTrustArgs() {}

    private DomainTrustArgs(DomainTrustArgs $) {
        this.domain = $.domain;
        this.project = $.project;
        this.selectiveAuthentication = $.selectiveAuthentication;
        this.targetDnsIpAddresses = $.targetDnsIpAddresses;
        this.targetDomainName = $.targetDomainName;
        this.trustDirection = $.trustDirection;
        this.trustHandshakeSecret = $.trustHandshakeSecret;
        this.trustType = $.trustType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainTrustArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainTrustArgs $;

        public Builder() {
            $ = new DomainTrustArgs();
        }

        public Builder(DomainTrustArgs defaults) {
            $ = new DomainTrustArgs(Objects.requireNonNull(defaults));
        }

        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder selectiveAuthentication(@Nullable Output<Boolean> selectiveAuthentication) {
            $.selectiveAuthentication = selectiveAuthentication;
            return this;
        }

        public Builder selectiveAuthentication(Boolean selectiveAuthentication) {
            return selectiveAuthentication(Output.of(selectiveAuthentication));
        }

        public Builder targetDnsIpAddresses(Output<List<String>> targetDnsIpAddresses) {
            $.targetDnsIpAddresses = targetDnsIpAddresses;
            return this;
        }

        public Builder targetDnsIpAddresses(List<String> targetDnsIpAddresses) {
            return targetDnsIpAddresses(Output.of(targetDnsIpAddresses));
        }

        public Builder targetDnsIpAddresses(String... targetDnsIpAddresses) {
            return targetDnsIpAddresses(List.of(targetDnsIpAddresses));
        }

        public Builder targetDomainName(Output<String> targetDomainName) {
            $.targetDomainName = targetDomainName;
            return this;
        }

        public Builder targetDomainName(String targetDomainName) {
            return targetDomainName(Output.of(targetDomainName));
        }

        public Builder trustDirection(Output<String> trustDirection) {
            $.trustDirection = trustDirection;
            return this;
        }

        public Builder trustDirection(String trustDirection) {
            return trustDirection(Output.of(trustDirection));
        }

        public Builder trustHandshakeSecret(Output<String> trustHandshakeSecret) {
            $.trustHandshakeSecret = trustHandshakeSecret;
            return this;
        }

        public Builder trustHandshakeSecret(String trustHandshakeSecret) {
            return trustHandshakeSecret(Output.of(trustHandshakeSecret));
        }

        public Builder trustType(Output<String> trustType) {
            $.trustType = trustType;
            return this;
        }

        public Builder trustType(String trustType) {
            return trustType(Output.of(trustType));
        }

        public DomainTrustArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.targetDnsIpAddresses = Objects.requireNonNull($.targetDnsIpAddresses, "expected parameter 'targetDnsIpAddresses' to be non-null");
            $.targetDomainName = Objects.requireNonNull($.targetDomainName, "expected parameter 'targetDomainName' to be non-null");
            $.trustDirection = Objects.requireNonNull($.trustDirection, "expected parameter 'trustDirection' to be non-null");
            $.trustHandshakeSecret = Objects.requireNonNull($.trustHandshakeSecret, "expected parameter 'trustHandshakeSecret' to be non-null");
            $.trustType = Objects.requireNonNull($.trustType, "expected parameter 'trustType' to be non-null");
            return $;
        }
    }

}

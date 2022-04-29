// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.activedirectory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainTrustState extends ResourceArgs {

    public static final DomainTrustState Empty = new DomainTrustState();

    /**
     * The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
     * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
     * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
     * 
     */
    @Import(name="selectiveAuthentication")
    private @Nullable Output<Boolean> selectiveAuthentication;

    /**
     * @return Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
     * 
     */
    public Optional<Output<Boolean>> selectiveAuthentication() {
        return Optional.ofNullable(this.selectiveAuthentication);
    }

    /**
     * The target DNS server IP addresses which can resolve the remote domain involved in the trust.
     * 
     */
    @Import(name="targetDnsIpAddresses")
    private @Nullable Output<List<String>> targetDnsIpAddresses;

    /**
     * @return The target DNS server IP addresses which can resolve the remote domain involved in the trust.
     * 
     */
    public Optional<Output<List<String>>> targetDnsIpAddresses() {
        return Optional.ofNullable(this.targetDnsIpAddresses);
    }

    /**
     * The fully qualified target domain name which will be in trust with the current domain.
     * 
     */
    @Import(name="targetDomainName")
    private @Nullable Output<String> targetDomainName;

    /**
     * @return The fully qualified target domain name which will be in trust with the current domain.
     * 
     */
    public Optional<Output<String>> targetDomainName() {
        return Optional.ofNullable(this.targetDomainName);
    }

    /**
     * The trust direction, which decides if the current domain is trusted, trusting, or both.
     * Possible values are `INBOUND`, `OUTBOUND`, and `BIDIRECTIONAL`.
     * 
     */
    @Import(name="trustDirection")
    private @Nullable Output<String> trustDirection;

    /**
     * @return The trust direction, which decides if the current domain is trusted, trusting, or both.
     * Possible values are `INBOUND`, `OUTBOUND`, and `BIDIRECTIONAL`.
     * 
     */
    public Optional<Output<String>> trustDirection() {
        return Optional.ofNullable(this.trustDirection);
    }

    /**
     * The trust secret used for the handshake with the target domain. This will not be stored.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="trustHandshakeSecret")
    private @Nullable Output<String> trustHandshakeSecret;

    /**
     * @return The trust secret used for the handshake with the target domain. This will not be stored.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> trustHandshakeSecret() {
        return Optional.ofNullable(this.trustHandshakeSecret);
    }

    /**
     * The type of trust represented by the trust resource.
     * Possible values are `FOREST` and `EXTERNAL`.
     * 
     */
    @Import(name="trustType")
    private @Nullable Output<String> trustType;

    /**
     * @return The type of trust represented by the trust resource.
     * Possible values are `FOREST` and `EXTERNAL`.
     * 
     */
    public Optional<Output<String>> trustType() {
        return Optional.ofNullable(this.trustType);
    }

    private DomainTrustState() {}

    private DomainTrustState(DomainTrustState $) {
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
    public static Builder builder(DomainTrustState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainTrustState $;

        public Builder() {
            $ = new DomainTrustState();
        }

        public Builder(DomainTrustState defaults) {
            $ = new DomainTrustState(Objects.requireNonNull(defaults));
        }

        /**
         * @param domain The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
         * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The fully qualified domain name. e.g. mydomain.myorganization.com, with the restrictions,
         * https://cloud.google.com/managed-microsoft-ad/reference/rest/v1/projects.locations.global.domains.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param selectiveAuthentication Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
         * 
         * @return builder
         * 
         */
        public Builder selectiveAuthentication(@Nullable Output<Boolean> selectiveAuthentication) {
            $.selectiveAuthentication = selectiveAuthentication;
            return this;
        }

        /**
         * @param selectiveAuthentication Whether the trusted side has forest/domain wide access or selective access to an approved set of resources.
         * 
         * @return builder
         * 
         */
        public Builder selectiveAuthentication(Boolean selectiveAuthentication) {
            return selectiveAuthentication(Output.of(selectiveAuthentication));
        }

        /**
         * @param targetDnsIpAddresses The target DNS server IP addresses which can resolve the remote domain involved in the trust.
         * 
         * @return builder
         * 
         */
        public Builder targetDnsIpAddresses(@Nullable Output<List<String>> targetDnsIpAddresses) {
            $.targetDnsIpAddresses = targetDnsIpAddresses;
            return this;
        }

        /**
         * @param targetDnsIpAddresses The target DNS server IP addresses which can resolve the remote domain involved in the trust.
         * 
         * @return builder
         * 
         */
        public Builder targetDnsIpAddresses(List<String> targetDnsIpAddresses) {
            return targetDnsIpAddresses(Output.of(targetDnsIpAddresses));
        }

        /**
         * @param targetDnsIpAddresses The target DNS server IP addresses which can resolve the remote domain involved in the trust.
         * 
         * @return builder
         * 
         */
        public Builder targetDnsIpAddresses(String... targetDnsIpAddresses) {
            return targetDnsIpAddresses(List.of(targetDnsIpAddresses));
        }

        /**
         * @param targetDomainName The fully qualified target domain name which will be in trust with the current domain.
         * 
         * @return builder
         * 
         */
        public Builder targetDomainName(@Nullable Output<String> targetDomainName) {
            $.targetDomainName = targetDomainName;
            return this;
        }

        /**
         * @param targetDomainName The fully qualified target domain name which will be in trust with the current domain.
         * 
         * @return builder
         * 
         */
        public Builder targetDomainName(String targetDomainName) {
            return targetDomainName(Output.of(targetDomainName));
        }

        /**
         * @param trustDirection The trust direction, which decides if the current domain is trusted, trusting, or both.
         * Possible values are `INBOUND`, `OUTBOUND`, and `BIDIRECTIONAL`.
         * 
         * @return builder
         * 
         */
        public Builder trustDirection(@Nullable Output<String> trustDirection) {
            $.trustDirection = trustDirection;
            return this;
        }

        /**
         * @param trustDirection The trust direction, which decides if the current domain is trusted, trusting, or both.
         * Possible values are `INBOUND`, `OUTBOUND`, and `BIDIRECTIONAL`.
         * 
         * @return builder
         * 
         */
        public Builder trustDirection(String trustDirection) {
            return trustDirection(Output.of(trustDirection));
        }

        /**
         * @param trustHandshakeSecret The trust secret used for the handshake with the target domain. This will not be stored.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder trustHandshakeSecret(@Nullable Output<String> trustHandshakeSecret) {
            $.trustHandshakeSecret = trustHandshakeSecret;
            return this;
        }

        /**
         * @param trustHandshakeSecret The trust secret used for the handshake with the target domain. This will not be stored.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder trustHandshakeSecret(String trustHandshakeSecret) {
            return trustHandshakeSecret(Output.of(trustHandshakeSecret));
        }

        /**
         * @param trustType The type of trust represented by the trust resource.
         * Possible values are `FOREST` and `EXTERNAL`.
         * 
         * @return builder
         * 
         */
        public Builder trustType(@Nullable Output<String> trustType) {
            $.trustType = trustType;
            return this;
        }

        /**
         * @param trustType The type of trust represented by the trust resource.
         * Possible values are `FOREST` and `EXTERNAL`.
         * 
         * @return builder
         * 
         */
        public Builder trustType(String trustType) {
            return trustType(Output.of(trustType));
        }

        public DomainTrustState build() {
            return $;
        }
    }

}

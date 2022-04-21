// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner.inputs;

import com.pulumi.aws.apprunner.inputs.CustomDomainAssociationCertificateValidationRecordGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDomainAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainAssociationState Empty = new CustomDomainAssociationState();

    /**
     * A set of certificate CNAME records used for this domain name. See Certificate Validation Records below for more details.
     * 
     */
    @Import(name="certificateValidationRecords")
    private @Nullable Output<List<CustomDomainAssociationCertificateValidationRecordGetArgs>> certificateValidationRecords;

    public Optional<Output<List<CustomDomainAssociationCertificateValidationRecordGetArgs>>> certificateValidationRecords() {
        return Optional.ofNullable(this.certificateValidationRecords);
    }

    /**
     * The App Runner subdomain of the App Runner service. The custom domain name is mapped to this target name. Attribute only available if resource created (not imported) with this provider.
     * 
     */
    @Import(name="dnsTarget")
    private @Nullable Output<String> dnsTarget;

    public Optional<Output<String>> dnsTarget() {
        return Optional.ofNullable(this.dnsTarget);
    }

    /**
     * The custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
     * 
     */
    @Import(name="enableWwwSubdomain")
    private @Nullable Output<Boolean> enableWwwSubdomain;

    public Optional<Output<Boolean>> enableWwwSubdomain() {
        return Optional.ofNullable(this.enableWwwSubdomain);
    }

    /**
     * The ARN of the App Runner service.
     * 
     */
    @Import(name="serviceArn")
    private @Nullable Output<String> serviceArn;

    public Optional<Output<String>> serviceArn() {
        return Optional.ofNullable(this.serviceArn);
    }

    /**
     * The current state of the certificate CNAME record validation. It should change to `SUCCESS` after App Runner completes validation with your DNS.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private CustomDomainAssociationState() {}

    private CustomDomainAssociationState(CustomDomainAssociationState $) {
        this.certificateValidationRecords = $.certificateValidationRecords;
        this.dnsTarget = $.dnsTarget;
        this.domainName = $.domainName;
        this.enableWwwSubdomain = $.enableWwwSubdomain;
        this.serviceArn = $.serviceArn;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainAssociationState $;

        public Builder() {
            $ = new CustomDomainAssociationState();
        }

        public Builder(CustomDomainAssociationState defaults) {
            $ = new CustomDomainAssociationState(Objects.requireNonNull(defaults));
        }

        public Builder certificateValidationRecords(@Nullable Output<List<CustomDomainAssociationCertificateValidationRecordGetArgs>> certificateValidationRecords) {
            $.certificateValidationRecords = certificateValidationRecords;
            return this;
        }

        public Builder certificateValidationRecords(List<CustomDomainAssociationCertificateValidationRecordGetArgs> certificateValidationRecords) {
            return certificateValidationRecords(Output.of(certificateValidationRecords));
        }

        public Builder certificateValidationRecords(CustomDomainAssociationCertificateValidationRecordGetArgs... certificateValidationRecords) {
            return certificateValidationRecords(List.of(certificateValidationRecords));
        }

        public Builder dnsTarget(@Nullable Output<String> dnsTarget) {
            $.dnsTarget = dnsTarget;
            return this;
        }

        public Builder dnsTarget(String dnsTarget) {
            return dnsTarget(Output.of(dnsTarget));
        }

        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public Builder enableWwwSubdomain(@Nullable Output<Boolean> enableWwwSubdomain) {
            $.enableWwwSubdomain = enableWwwSubdomain;
            return this;
        }

        public Builder enableWwwSubdomain(Boolean enableWwwSubdomain) {
            return enableWwwSubdomain(Output.of(enableWwwSubdomain));
        }

        public Builder serviceArn(@Nullable Output<String> serviceArn) {
            $.serviceArn = serviceArn;
            return this;
        }

        public Builder serviceArn(String serviceArn) {
            return serviceArn(Output.of(serviceArn));
        }

        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        public Builder status(String status) {
            return status(Output.of(status));
        }

        public CustomDomainAssociationState build() {
            return $;
        }
    }

}

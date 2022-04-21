// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amplify.inputs;

import com.pulumi.aws.amplify.inputs.DomainAssociationSubDomainGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final DomainAssociationState Empty = new DomainAssociationState();

    /**
     * The unique ID for an Amplify app.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The Amazon Resource Name (ARN) for the domain association.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The DNS record for certificate verification.
     * 
     */
    @Import(name="certificateVerificationDnsRecord")
    private @Nullable Output<String> certificateVerificationDnsRecord;

    public Optional<Output<String>> certificateVerificationDnsRecord() {
        return Optional.ofNullable(this.certificateVerificationDnsRecord);
    }

    /**
     * The domain name for the domain association.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The setting for the subdomain. Documented below.
     * 
     */
    @Import(name="subDomains")
    private @Nullable Output<List<DomainAssociationSubDomainGetArgs>> subDomains;

    public Optional<Output<List<DomainAssociationSubDomainGetArgs>>> subDomains() {
        return Optional.ofNullable(this.subDomains);
    }

    /**
     * If enabled, the resource will wait for the domain association status to change to `PENDING_DEPLOYMENT` or `AVAILABLE`. Setting this to `false` will skip the process. Default: `true`.
     * 
     */
    @Import(name="waitForVerification")
    private @Nullable Output<Boolean> waitForVerification;

    public Optional<Output<Boolean>> waitForVerification() {
        return Optional.ofNullable(this.waitForVerification);
    }

    private DomainAssociationState() {}

    private DomainAssociationState(DomainAssociationState $) {
        this.appId = $.appId;
        this.arn = $.arn;
        this.certificateVerificationDnsRecord = $.certificateVerificationDnsRecord;
        this.domainName = $.domainName;
        this.subDomains = $.subDomains;
        this.waitForVerification = $.waitForVerification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainAssociationState $;

        public Builder() {
            $ = new DomainAssociationState();
        }

        public Builder(DomainAssociationState defaults) {
            $ = new DomainAssociationState(Objects.requireNonNull(defaults));
        }

        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder certificateVerificationDnsRecord(@Nullable Output<String> certificateVerificationDnsRecord) {
            $.certificateVerificationDnsRecord = certificateVerificationDnsRecord;
            return this;
        }

        public Builder certificateVerificationDnsRecord(String certificateVerificationDnsRecord) {
            return certificateVerificationDnsRecord(Output.of(certificateVerificationDnsRecord));
        }

        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        public Builder subDomains(@Nullable Output<List<DomainAssociationSubDomainGetArgs>> subDomains) {
            $.subDomains = subDomains;
            return this;
        }

        public Builder subDomains(List<DomainAssociationSubDomainGetArgs> subDomains) {
            return subDomains(Output.of(subDomains));
        }

        public Builder subDomains(DomainAssociationSubDomainGetArgs... subDomains) {
            return subDomains(List.of(subDomains));
        }

        public Builder waitForVerification(@Nullable Output<Boolean> waitForVerification) {
            $.waitForVerification = waitForVerification;
            return this;
        }

        public Builder waitForVerification(Boolean waitForVerification) {
            return waitForVerification(Output.of(waitForVerification));
        }

        public DomainAssociationState build() {
            return $;
        }
    }

}

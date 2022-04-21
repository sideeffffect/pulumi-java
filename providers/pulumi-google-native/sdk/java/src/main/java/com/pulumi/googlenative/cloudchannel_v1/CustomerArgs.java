// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudchannel_v1.inputs.GoogleCloudChannelV1ContactInfoArgs;
import com.pulumi.googlenative.cloudchannel_v1.inputs.GoogleTypePostalAddressArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomerArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomerArgs Empty = new CustomerArgs();

    @Import(name="accountId", required=true)
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Secondary contact email. You need to provide an alternate email to create different domains if a primary contact email already exists. Users will receive a notification with credentials when you create an admin.google.com account. Secondary emails are also recovery email addresses. Alternate emails are optional when you create Team customers.
     * 
     */
    @Import(name="alternateEmail")
    private @Nullable Output<String> alternateEmail;

    public Optional<Output<String>> alternateEmail() {
        return Optional.ofNullable(this.alternateEmail);
    }

    /**
     * Cloud Identity ID of the customer&#39;s channel partner. Populated only if a channel partner exists for this customer.
     * 
     */
    @Import(name="channelPartnerId")
    private @Nullable Output<String> channelPartnerId;

    public Optional<Output<String>> channelPartnerId() {
        return Optional.ofNullable(this.channelPartnerId);
    }

    @Import(name="channelPartnerLinkId", required=true)
    private Output<String> channelPartnerLinkId;

    public Output<String> channelPartnerLinkId() {
        return this.channelPartnerLinkId;
    }

    /**
     * The customer&#39;s primary domain. Must match the primary contact email&#39;s domain.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }

    /**
     * Optional. The BCP-47 language code, such as &#34;en-US&#34; or &#34;sr-Latn&#34;. For more information, see https://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    /**
     * Name of the organization that the customer entity represents.
     * 
     */
    @Import(name="orgDisplayName", required=true)
    private Output<String> orgDisplayName;

    public Output<String> orgDisplayName() {
        return this.orgDisplayName;
    }

    /**
     * The organization address for the customer. To enforce US laws and embargoes, we require a region and zip code. You must provide valid addresses for every customer. To set the customer&#39;s language, use the Customer-level language code.
     * 
     */
    @Import(name="orgPostalAddress", required=true)
    private Output<GoogleTypePostalAddressArgs> orgPostalAddress;

    public Output<GoogleTypePostalAddressArgs> orgPostalAddress() {
        return this.orgPostalAddress;
    }

    /**
     * Primary contact info.
     * 
     */
    @Import(name="primaryContactInfo")
    private @Nullable Output<GoogleCloudChannelV1ContactInfoArgs> primaryContactInfo;

    public Optional<Output<GoogleCloudChannelV1ContactInfoArgs>> primaryContactInfo() {
        return Optional.ofNullable(this.primaryContactInfo);
    }

    private CustomerArgs() {}

    private CustomerArgs(CustomerArgs $) {
        this.accountId = $.accountId;
        this.alternateEmail = $.alternateEmail;
        this.channelPartnerId = $.channelPartnerId;
        this.channelPartnerLinkId = $.channelPartnerLinkId;
        this.domain = $.domain;
        this.languageCode = $.languageCode;
        this.orgDisplayName = $.orgDisplayName;
        this.orgPostalAddress = $.orgPostalAddress;
        this.primaryContactInfo = $.primaryContactInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerArgs $;

        public Builder() {
            $ = new CustomerArgs();
        }

        public Builder(CustomerArgs defaults) {
            $ = new CustomerArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder alternateEmail(@Nullable Output<String> alternateEmail) {
            $.alternateEmail = alternateEmail;
            return this;
        }

        public Builder alternateEmail(String alternateEmail) {
            return alternateEmail(Output.of(alternateEmail));
        }

        public Builder channelPartnerId(@Nullable Output<String> channelPartnerId) {
            $.channelPartnerId = channelPartnerId;
            return this;
        }

        public Builder channelPartnerId(String channelPartnerId) {
            return channelPartnerId(Output.of(channelPartnerId));
        }

        public Builder channelPartnerLinkId(Output<String> channelPartnerLinkId) {
            $.channelPartnerLinkId = channelPartnerLinkId;
            return this;
        }

        public Builder channelPartnerLinkId(String channelPartnerLinkId) {
            return channelPartnerLinkId(Output.of(channelPartnerLinkId));
        }

        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        public Builder orgDisplayName(Output<String> orgDisplayName) {
            $.orgDisplayName = orgDisplayName;
            return this;
        }

        public Builder orgDisplayName(String orgDisplayName) {
            return orgDisplayName(Output.of(orgDisplayName));
        }

        public Builder orgPostalAddress(Output<GoogleTypePostalAddressArgs> orgPostalAddress) {
            $.orgPostalAddress = orgPostalAddress;
            return this;
        }

        public Builder orgPostalAddress(GoogleTypePostalAddressArgs orgPostalAddress) {
            return orgPostalAddress(Output.of(orgPostalAddress));
        }

        public Builder primaryContactInfo(@Nullable Output<GoogleCloudChannelV1ContactInfoArgs> primaryContactInfo) {
            $.primaryContactInfo = primaryContactInfo;
            return this;
        }

        public Builder primaryContactInfo(GoogleCloudChannelV1ContactInfoArgs primaryContactInfo) {
            return primaryContactInfo(Output.of(primaryContactInfo));
        }

        public CustomerArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.channelPartnerLinkId = Objects.requireNonNull($.channelPartnerLinkId, "expected parameter 'channelPartnerLinkId' to be non-null");
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.orgDisplayName = Objects.requireNonNull($.orgDisplayName, "expected parameter 'orgDisplayName' to be non-null");
            $.orgPostalAddress = Objects.requireNonNull($.orgPostalAddress, "expected parameter 'orgPostalAddress' to be non-null");
            return $;
        }
    }

}

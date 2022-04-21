// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains FQDN of the DNS record associated with the public IP address.
 * 
 */
public final class PublicIPAddressDnsSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublicIPAddressDnsSettingsArgs Empty = new PublicIPAddressDnsSettingsArgs();

    /**
     * The domain name label. The concatenation of the domain name label and the regionalized DNS zone make up the fully qualified domain name associated with the public IP address. If a domain name label is specified, an A DNS record is created for the public IP in the Microsoft Azure DNS system.
     * 
     */
    @Import(name="domainNameLabel")
    private @Nullable Output<String> domainNameLabel;

    public Optional<Output<String>> domainNameLabel() {
        return Optional.ofNullable(this.domainNameLabel);
    }

    /**
     * The Fully Qualified Domain Name of the A DNS record associated with the public IP. This is the concatenation of the domainNameLabel and the regionalized DNS zone.
     * 
     */
    @Import(name="fqdn")
    private @Nullable Output<String> fqdn;

    public Optional<Output<String>> fqdn() {
        return Optional.ofNullable(this.fqdn);
    }

    /**
     * The reverse FQDN. A user-visible, fully qualified domain name that resolves to this public IP address. If the reverseFqdn is specified, then a PTR DNS record is created pointing from the IP address in the in-addr.arpa domain to the reverse FQDN.
     * 
     */
    @Import(name="reverseFqdn")
    private @Nullable Output<String> reverseFqdn;

    public Optional<Output<String>> reverseFqdn() {
        return Optional.ofNullable(this.reverseFqdn);
    }

    private PublicIPAddressDnsSettingsArgs() {}

    private PublicIPAddressDnsSettingsArgs(PublicIPAddressDnsSettingsArgs $) {
        this.domainNameLabel = $.domainNameLabel;
        this.fqdn = $.fqdn;
        this.reverseFqdn = $.reverseFqdn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublicIPAddressDnsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublicIPAddressDnsSettingsArgs $;

        public Builder() {
            $ = new PublicIPAddressDnsSettingsArgs();
        }

        public Builder(PublicIPAddressDnsSettingsArgs defaults) {
            $ = new PublicIPAddressDnsSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder domainNameLabel(@Nullable Output<String> domainNameLabel) {
            $.domainNameLabel = domainNameLabel;
            return this;
        }

        public Builder domainNameLabel(String domainNameLabel) {
            return domainNameLabel(Output.of(domainNameLabel));
        }

        public Builder fqdn(@Nullable Output<String> fqdn) {
            $.fqdn = fqdn;
            return this;
        }

        public Builder fqdn(String fqdn) {
            return fqdn(Output.of(fqdn));
        }

        public Builder reverseFqdn(@Nullable Output<String> reverseFqdn) {
            $.reverseFqdn = reverseFqdn;
            return this;
        }

        public Builder reverseFqdn(String reverseFqdn) {
            return reverseFqdn(Output.of(reverseFqdn));
        }

        public PublicIPAddressDnsSettingsArgs build() {
            return $;
        }
    }

}

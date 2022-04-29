// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateConfigSubjectConfigSubjectAltNameArgs extends ResourceArgs {

    public static final CertificateConfigSubjectConfigSubjectAltNameArgs Empty = new CertificateConfigSubjectConfigSubjectAltNameArgs();

    /**
     * Contains only valid, fully-qualified host names.
     * 
     */
    @Import(name="dnsNames")
    private @Nullable Output<List<String>> dnsNames;

    /**
     * @return Contains only valid, fully-qualified host names.
     * 
     */
    public Optional<Output<List<String>>> dnsNames() {
        return Optional.ofNullable(this.dnsNames);
    }

    /**
     * Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    @Import(name="emailAddresses")
    private @Nullable Output<List<String>> emailAddresses;

    /**
     * @return Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    public Optional<Output<List<String>>> emailAddresses() {
        return Optional.ofNullable(this.emailAddresses);
    }

    /**
     * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    @Import(name="ipAddresses")
    private @Nullable Output<List<String>> ipAddresses;

    /**
     * @return Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    public Optional<Output<List<String>>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }

    /**
     * Contains only valid RFC 3986 URIs.
     * 
     */
    @Import(name="uris")
    private @Nullable Output<List<String>> uris;

    /**
     * @return Contains only valid RFC 3986 URIs.
     * 
     */
    public Optional<Output<List<String>>> uris() {
        return Optional.ofNullable(this.uris);
    }

    private CertificateConfigSubjectConfigSubjectAltNameArgs() {}

    private CertificateConfigSubjectConfigSubjectAltNameArgs(CertificateConfigSubjectConfigSubjectAltNameArgs $) {
        this.dnsNames = $.dnsNames;
        this.emailAddresses = $.emailAddresses;
        this.ipAddresses = $.ipAddresses;
        this.uris = $.uris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateConfigSubjectConfigSubjectAltNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigSubjectConfigSubjectAltNameArgs $;

        public Builder() {
            $ = new CertificateConfigSubjectConfigSubjectAltNameArgs();
        }

        public Builder(CertificateConfigSubjectConfigSubjectAltNameArgs defaults) {
            $ = new CertificateConfigSubjectConfigSubjectAltNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dnsNames Contains only valid, fully-qualified host names.
         * 
         * @return builder
         * 
         */
        public Builder dnsNames(@Nullable Output<List<String>> dnsNames) {
            $.dnsNames = dnsNames;
            return this;
        }

        /**
         * @param dnsNames Contains only valid, fully-qualified host names.
         * 
         * @return builder
         * 
         */
        public Builder dnsNames(List<String> dnsNames) {
            return dnsNames(Output.of(dnsNames));
        }

        /**
         * @param dnsNames Contains only valid, fully-qualified host names.
         * 
         * @return builder
         * 
         */
        public Builder dnsNames(String... dnsNames) {
            return dnsNames(List.of(dnsNames));
        }

        /**
         * @param emailAddresses Contains only valid RFC 2822 E-mail addresses.
         * 
         * @return builder
         * 
         */
        public Builder emailAddresses(@Nullable Output<List<String>> emailAddresses) {
            $.emailAddresses = emailAddresses;
            return this;
        }

        /**
         * @param emailAddresses Contains only valid RFC 2822 E-mail addresses.
         * 
         * @return builder
         * 
         */
        public Builder emailAddresses(List<String> emailAddresses) {
            return emailAddresses(Output.of(emailAddresses));
        }

        /**
         * @param emailAddresses Contains only valid RFC 2822 E-mail addresses.
         * 
         * @return builder
         * 
         */
        public Builder emailAddresses(String... emailAddresses) {
            return emailAddresses(List.of(emailAddresses));
        }

        /**
         * @param ipAddresses Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(@Nullable Output<List<String>> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * @param ipAddresses Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(List<String> ipAddresses) {
            return ipAddresses(Output.of(ipAddresses));
        }

        /**
         * @param ipAddresses Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
         * 
         * @return builder
         * 
         */
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }

        /**
         * @param uris Contains only valid RFC 3986 URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(@Nullable Output<List<String>> uris) {
            $.uris = uris;
            return this;
        }

        /**
         * @param uris Contains only valid RFC 3986 URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(List<String> uris) {
            return uris(Output.of(uris));
        }

        /**
         * @param uris Contains only valid RFC 3986 URIs.
         * 
         * @return builder
         * 
         */
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }

        public CertificateConfigSubjectConfigSubjectAltNameArgs build() {
            return $;
        }
    }

}

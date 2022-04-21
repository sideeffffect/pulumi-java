// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthorityAccessUrlArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorityAccessUrlArgs Empty = new AuthorityAccessUrlArgs();

    @Import(name="caCertificateAccessUrl")
    private @Nullable Output<String> caCertificateAccessUrl;

    public Optional<Output<String>> caCertificateAccessUrl() {
        return Optional.ofNullable(this.caCertificateAccessUrl);
    }

    @Import(name="crlAccessUrls")
    private @Nullable Output<List<String>> crlAccessUrls;

    public Optional<Output<List<String>>> crlAccessUrls() {
        return Optional.ofNullable(this.crlAccessUrls);
    }

    private AuthorityAccessUrlArgs() {}

    private AuthorityAccessUrlArgs(AuthorityAccessUrlArgs $) {
        this.caCertificateAccessUrl = $.caCertificateAccessUrl;
        this.crlAccessUrls = $.crlAccessUrls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorityAccessUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityAccessUrlArgs $;

        public Builder() {
            $ = new AuthorityAccessUrlArgs();
        }

        public Builder(AuthorityAccessUrlArgs defaults) {
            $ = new AuthorityAccessUrlArgs(Objects.requireNonNull(defaults));
        }

        public Builder caCertificateAccessUrl(@Nullable Output<String> caCertificateAccessUrl) {
            $.caCertificateAccessUrl = caCertificateAccessUrl;
            return this;
        }

        public Builder caCertificateAccessUrl(String caCertificateAccessUrl) {
            return caCertificateAccessUrl(Output.of(caCertificateAccessUrl));
        }

        public Builder crlAccessUrls(@Nullable Output<List<String>> crlAccessUrls) {
            $.crlAccessUrls = crlAccessUrls;
            return this;
        }

        public Builder crlAccessUrls(List<String> crlAccessUrls) {
            return crlAccessUrls(Output.of(crlAccessUrls));
        }

        public Builder crlAccessUrls(String... crlAccessUrls) {
            return crlAccessUrls(List.of(crlAccessUrls));
        }

        public AuthorityAccessUrlArgs build() {
            return $;
        }
    }

}

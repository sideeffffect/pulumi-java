// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCryptoKeyVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCryptoKeyVersionArgs Empty = new GetCryptoKeyVersionArgs();

    @Import(name="cryptoKeyId", required=true)
    private String cryptoKeyId;

    public String cryptoKeyId() {
        return this.cryptoKeyId;
    }

    @Import(name="cryptoKeyVersionId", required=true)
    private String cryptoKeyVersionId;

    public String cryptoKeyVersionId() {
        return this.cryptoKeyVersionId;
    }

    @Import(name="keyRingId", required=true)
    private String keyRingId;

    public String keyRingId() {
        return this.keyRingId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetCryptoKeyVersionArgs() {}

    private GetCryptoKeyVersionArgs(GetCryptoKeyVersionArgs $) {
        this.cryptoKeyId = $.cryptoKeyId;
        this.cryptoKeyVersionId = $.cryptoKeyVersionId;
        this.keyRingId = $.keyRingId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCryptoKeyVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCryptoKeyVersionArgs $;

        public Builder() {
            $ = new GetCryptoKeyVersionArgs();
        }

        public Builder(GetCryptoKeyVersionArgs defaults) {
            $ = new GetCryptoKeyVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder cryptoKeyId(String cryptoKeyId) {
            $.cryptoKeyId = cryptoKeyId;
            return this;
        }

        public Builder cryptoKeyVersionId(String cryptoKeyVersionId) {
            $.cryptoKeyVersionId = cryptoKeyVersionId;
            return this;
        }

        public Builder keyRingId(String keyRingId) {
            $.keyRingId = keyRingId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetCryptoKeyVersionArgs build() {
            $.cryptoKeyId = Objects.requireNonNull($.cryptoKeyId, "expected parameter 'cryptoKeyId' to be non-null");
            $.cryptoKeyVersionId = Objects.requireNonNull($.cryptoKeyVersionId, "expected parameter 'cryptoKeyVersionId' to be non-null");
            $.keyRingId = Objects.requireNonNull($.keyRingId, "expected parameter 'keyRingId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}

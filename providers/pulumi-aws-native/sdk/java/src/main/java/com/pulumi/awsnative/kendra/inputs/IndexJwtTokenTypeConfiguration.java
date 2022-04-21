// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.enums.IndexKeyLocation;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndexJwtTokenTypeConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final IndexJwtTokenTypeConfiguration Empty = new IndexJwtTokenTypeConfiguration();

    @Import(name="claimRegex")
    private @Nullable String claimRegex;

    public Optional<String> claimRegex() {
        return Optional.ofNullable(this.claimRegex);
    }

    @Import(name="groupAttributeField")
    private @Nullable String groupAttributeField;

    public Optional<String> groupAttributeField() {
        return Optional.ofNullable(this.groupAttributeField);
    }

    @Import(name="issuer")
    private @Nullable String issuer;

    public Optional<String> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    @Import(name="keyLocation", required=true)
    private IndexKeyLocation keyLocation;

    public IndexKeyLocation keyLocation() {
        return this.keyLocation;
    }

    @Import(name="secretManagerArn")
    private @Nullable String secretManagerArn;

    public Optional<String> secretManagerArn() {
        return Optional.ofNullable(this.secretManagerArn);
    }

    @Import(name="uRL")
    private @Nullable String uRL;

    public Optional<String> uRL() {
        return Optional.ofNullable(this.uRL);
    }

    @Import(name="userNameAttributeField")
    private @Nullable String userNameAttributeField;

    public Optional<String> userNameAttributeField() {
        return Optional.ofNullable(this.userNameAttributeField);
    }

    private IndexJwtTokenTypeConfiguration() {}

    private IndexJwtTokenTypeConfiguration(IndexJwtTokenTypeConfiguration $) {
        this.claimRegex = $.claimRegex;
        this.groupAttributeField = $.groupAttributeField;
        this.issuer = $.issuer;
        this.keyLocation = $.keyLocation;
        this.secretManagerArn = $.secretManagerArn;
        this.uRL = $.uRL;
        this.userNameAttributeField = $.userNameAttributeField;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndexJwtTokenTypeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndexJwtTokenTypeConfiguration $;

        public Builder() {
            $ = new IndexJwtTokenTypeConfiguration();
        }

        public Builder(IndexJwtTokenTypeConfiguration defaults) {
            $ = new IndexJwtTokenTypeConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder claimRegex(@Nullable String claimRegex) {
            $.claimRegex = claimRegex;
            return this;
        }

        public Builder groupAttributeField(@Nullable String groupAttributeField) {
            $.groupAttributeField = groupAttributeField;
            return this;
        }

        public Builder issuer(@Nullable String issuer) {
            $.issuer = issuer;
            return this;
        }

        public Builder keyLocation(IndexKeyLocation keyLocation) {
            $.keyLocation = keyLocation;
            return this;
        }

        public Builder secretManagerArn(@Nullable String secretManagerArn) {
            $.secretManagerArn = secretManagerArn;
            return this;
        }

        public Builder uRL(@Nullable String uRL) {
            $.uRL = uRL;
            return this;
        }

        public Builder userNameAttributeField(@Nullable String userNameAttributeField) {
            $.userNameAttributeField = userNameAttributeField;
            return this;
        }

        public IndexJwtTokenTypeConfiguration build() {
            $.keyLocation = Objects.requireNonNull($.keyLocation, "expected parameter 'keyLocation' to be non-null");
            return $;
        }
    }

}

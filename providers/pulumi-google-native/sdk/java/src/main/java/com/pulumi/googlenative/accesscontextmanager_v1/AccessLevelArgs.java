// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager_v1.inputs.BasicLevelArgs;
import com.pulumi.googlenative.accesscontextmanager_v1.inputs.CustomLevelArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessLevelArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessLevelArgs Empty = new AccessLevelArgs();

    @Import(name="accessPolicyId", required=true)
    private Output<String> accessPolicyId;

    public Output<String> accessPolicyId() {
        return this.accessPolicyId;
    }

    /**
     * A `BasicLevel` composed of `Conditions`.
     * 
     */
    @Import(name="basic")
    private @Nullable Output<BasicLevelArgs> basic;

    public Optional<Output<BasicLevelArgs>> basic() {
        return Optional.ofNullable(this.basic);
    }

    /**
     * A `CustomLevel` written in the Common Expression Language.
     * 
     */
    @Import(name="custom")
    private @Nullable Output<CustomLevelArgs> custom;

    public Optional<Output<CustomLevelArgs>> custom() {
        return Optional.ofNullable(this.custom);
    }

    /**
     * Description of the `AccessLevel` and its use. Does not affect behavior.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Resource name for the Access Level. The `short_name` component must begin with a letter and only include alphanumeric and &#39;_&#39;. Format: `accessPolicies/{access_policy}/accessLevels/{access_level}`. The maximum length of the `access_level` component is 50 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private AccessLevelArgs() {}

    private AccessLevelArgs(AccessLevelArgs $) {
        this.accessPolicyId = $.accessPolicyId;
        this.basic = $.basic;
        this.custom = $.custom;
        this.description = $.description;
        this.name = $.name;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessLevelArgs $;

        public Builder() {
            $ = new AccessLevelArgs();
        }

        public Builder(AccessLevelArgs defaults) {
            $ = new AccessLevelArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessPolicyId(Output<String> accessPolicyId) {
            $.accessPolicyId = accessPolicyId;
            return this;
        }

        public Builder accessPolicyId(String accessPolicyId) {
            return accessPolicyId(Output.of(accessPolicyId));
        }

        public Builder basic(@Nullable Output<BasicLevelArgs> basic) {
            $.basic = basic;
            return this;
        }

        public Builder basic(BasicLevelArgs basic) {
            return basic(Output.of(basic));
        }

        public Builder custom(@Nullable Output<CustomLevelArgs> custom) {
            $.custom = custom;
            return this;
        }

        public Builder custom(CustomLevelArgs custom) {
            return custom(Output.of(custom));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public AccessLevelArgs build() {
            $.accessPolicyId = Objects.requireNonNull($.accessPolicyId, "expected parameter 'accessPolicyId' to be non-null");
            return $;
        }
    }

}

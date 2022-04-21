// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.DeprecationStatusState;
import com.pulumi.googlenative.compute_beta.inputs.RolloutPolicyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deprecation status for a public resource.
 * 
 */
public final class DeprecationStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeprecationStatusArgs Empty = new DeprecationStatusArgs();

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @Import(name="deleted")
    private @Nullable Output<String> deleted;

    public Optional<Output<String>> deleted() {
        return Optional.ofNullable(this.deleted);
    }

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @Import(name="deprecated")
    private @Nullable Output<String> deprecated;

    public Optional<Output<String>> deprecated() {
        return Optional.ofNullable(this.deprecated);
    }

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @Import(name="obsolete")
    private @Nullable Output<String> obsolete;

    public Optional<Output<String>> obsolete() {
        return Optional.ofNullable(this.obsolete);
    }

    /**
     * The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
     * 
     */
    @Import(name="replacement")
    private @Nullable Output<String> replacement;

    public Optional<Output<String>> replacement() {
        return Optional.ofNullable(this.replacement);
    }

    /**
     * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
     * 
     */
    @Import(name="state")
    private @Nullable Output<DeprecationStatusState> state;

    public Optional<Output<DeprecationStatusState>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The rollout policy for this deprecation. This policy is only enforced by image family views. The rollout policy restricts the zones where the associated resource is considered in a deprecated state. When the rollout policy does not include the user specified zone, or if the zone is rolled out, the associated resource is considered in a deprecated state. The rollout policy for this deprecation is read-only, except for allowlisted users. This field might not be configured. To view the latest non-deprecated image in a specific zone, use the imageFamilyViews.get method.
     * 
     */
    @Import(name="stateOverride")
    private @Nullable Output<RolloutPolicyArgs> stateOverride;

    public Optional<Output<RolloutPolicyArgs>> stateOverride() {
        return Optional.ofNullable(this.stateOverride);
    }

    private DeprecationStatusArgs() {}

    private DeprecationStatusArgs(DeprecationStatusArgs $) {
        this.deleted = $.deleted;
        this.deprecated = $.deprecated;
        this.obsolete = $.obsolete;
        this.replacement = $.replacement;
        this.state = $.state;
        this.stateOverride = $.stateOverride;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeprecationStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeprecationStatusArgs $;

        public Builder() {
            $ = new DeprecationStatusArgs();
        }

        public Builder(DeprecationStatusArgs defaults) {
            $ = new DeprecationStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleted(@Nullable Output<String> deleted) {
            $.deleted = deleted;
            return this;
        }

        public Builder deleted(String deleted) {
            return deleted(Output.of(deleted));
        }

        public Builder deprecated(@Nullable Output<String> deprecated) {
            $.deprecated = deprecated;
            return this;
        }

        public Builder deprecated(String deprecated) {
            return deprecated(Output.of(deprecated));
        }

        public Builder obsolete(@Nullable Output<String> obsolete) {
            $.obsolete = obsolete;
            return this;
        }

        public Builder obsolete(String obsolete) {
            return obsolete(Output.of(obsolete));
        }

        public Builder replacement(@Nullable Output<String> replacement) {
            $.replacement = replacement;
            return this;
        }

        public Builder replacement(String replacement) {
            return replacement(Output.of(replacement));
        }

        public Builder state(@Nullable Output<DeprecationStatusState> state) {
            $.state = state;
            return this;
        }

        public Builder state(DeprecationStatusState state) {
            return state(Output.of(state));
        }

        public Builder stateOverride(@Nullable Output<RolloutPolicyArgs> stateOverride) {
            $.stateOverride = stateOverride;
            return this;
        }

        public Builder stateOverride(RolloutPolicyArgs stateOverride) {
            return stateOverride(Output.of(stateOverride));
        }

        public DeprecationStatusArgs build() {
            return $;
        }
    }

}

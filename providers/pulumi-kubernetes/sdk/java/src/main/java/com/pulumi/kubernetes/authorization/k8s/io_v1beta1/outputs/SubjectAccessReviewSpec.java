// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs.NonResourceAttributes;
import com.pulumi.kubernetes.authorization.k8s.io_v1beta1.outputs.ResourceAttributes;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubjectAccessReviewSpec {
    /**
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
     * 
     */
    private final @Nullable Map<String,List<String>> extra;
    /**
     * Groups is the groups you're testing for.
     * 
     */
    private final @Nullable List<String> group;
    /**
     * NonResourceAttributes describes information for a non-resource access request
     * 
     */
    private final @Nullable NonResourceAttributes nonResourceAttributes;
    /**
     * ResourceAuthorizationAttributes describes information for a resource access request
     * 
     */
    private final @Nullable ResourceAttributes resourceAttributes;
    /**
     * UID information about the requesting user.
     * 
     */
    private final @Nullable String uid;
    /**
     * User is the user you're testing for. If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
     * 
     */
    private final @Nullable String user;

    @CustomType.Constructor
    private SubjectAccessReviewSpec(
        @CustomType.Parameter("extra") @Nullable Map<String,List<String>> extra,
        @CustomType.Parameter("group") @Nullable List<String> group,
        @CustomType.Parameter("nonResourceAttributes") @Nullable NonResourceAttributes nonResourceAttributes,
        @CustomType.Parameter("resourceAttributes") @Nullable ResourceAttributes resourceAttributes,
        @CustomType.Parameter("uid") @Nullable String uid,
        @CustomType.Parameter("user") @Nullable String user) {
        this.extra = extra;
        this.group = group;
        this.nonResourceAttributes = nonResourceAttributes;
        this.resourceAttributes = resourceAttributes;
        this.uid = uid;
        this.user = user;
    }

    /**
     * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
     * 
    */
    public Map<String,List<String>> extra() {
        return this.extra == null ? Map.of() : this.extra;
    }
    /**
     * Groups is the groups you're testing for.
     * 
    */
    public List<String> group() {
        return this.group == null ? List.of() : this.group;
    }
    /**
     * NonResourceAttributes describes information for a non-resource access request
     * 
    */
    public Optional<NonResourceAttributes> nonResourceAttributes() {
        return Optional.ofNullable(this.nonResourceAttributes);
    }
    /**
     * ResourceAuthorizationAttributes describes information for a resource access request
     * 
    */
    public Optional<ResourceAttributes> resourceAttributes() {
        return Optional.ofNullable(this.resourceAttributes);
    }
    /**
     * UID information about the requesting user.
     * 
    */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }
    /**
     * User is the user you're testing for. If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
     * 
    */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectAccessReviewSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,List<String>> extra;
        private @Nullable List<String> group;
        private @Nullable NonResourceAttributes nonResourceAttributes;
        private @Nullable ResourceAttributes resourceAttributes;
        private @Nullable String uid;
        private @Nullable String user;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectAccessReviewSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extra = defaults.extra;
    	      this.group = defaults.group;
    	      this.nonResourceAttributes = defaults.nonResourceAttributes;
    	      this.resourceAttributes = defaults.resourceAttributes;
    	      this.uid = defaults.uid;
    	      this.user = defaults.user;
        }

        public Builder extra(@Nullable Map<String,List<String>> extra) {
            this.extra = extra;
            return this;
        }
        public Builder group(@Nullable List<String> group) {
            this.group = group;
            return this;
        }
        public Builder group(String... group) {
            return group(List.of(group));
        }
        public Builder nonResourceAttributes(@Nullable NonResourceAttributes nonResourceAttributes) {
            this.nonResourceAttributes = nonResourceAttributes;
            return this;
        }
        public Builder resourceAttributes(@Nullable ResourceAttributes resourceAttributes) {
            this.resourceAttributes = resourceAttributes;
            return this;
        }
        public Builder uid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }        public SubjectAccessReviewSpec build() {
            return new SubjectAccessReviewSpec(extra, group, nonResourceAttributes, resourceAttributes, uid, user);
        }
    }
}

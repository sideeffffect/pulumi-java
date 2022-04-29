// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyTagState extends ResourceArgs {

    public static final PolicyTagState Empty = new PolicyTagState();

    /**
     * Resource names of child policy tags of this policy tag.
     * 
     */
    @Import(name="childPolicyTags")
    private @Nullable Output<List<String>> childPolicyTags;

    /**
     * @return Resource names of child policy tags of this policy tag.
     * 
     */
    public Optional<Output<List<String>>> childPolicyTags() {
        return Optional.ofNullable(this.childPolicyTags);
    }

    /**
     * Description of this policy tag. It must: contain only unicode characters, tabs,
     * newlines, carriage returns and page breaks; and be at most 2000 bytes long when
     * encoded in UTF-8. If not set, defaults to an empty description.
     * If not set, defaults to an empty description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of this policy tag. It must: contain only unicode characters, tabs,
     * newlines, carriage returns and page breaks; and be at most 2000 bytes long when
     * encoded in UTF-8. If not set, defaults to an empty description.
     * If not set, defaults to an empty description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User defined name of this policy tag. It must: be unique within the parent
     * taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces;
     * not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return User defined name of this policy tag. It must: be unique within the parent
     * taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces;
     * not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Resource name of this policy tag, whose format is:
     * &#34;projects/{project}/locations/{region}/taxonomies/{taxonomy}/policyTags/{policytag}&#34;
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name of this policy tag, whose format is:
     * &#34;projects/{project}/locations/{region}/taxonomies/{taxonomy}/policyTags/{policytag}&#34;
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Resource name of this policy tag&#39;s parent policy tag.
     * If empty, it means this policy tag is a top level policy tag.
     * If not set, defaults to an empty string.
     * 
     */
    @Import(name="parentPolicyTag")
    private @Nullable Output<String> parentPolicyTag;

    /**
     * @return Resource name of this policy tag&#39;s parent policy tag.
     * If empty, it means this policy tag is a top level policy tag.
     * If not set, defaults to an empty string.
     * 
     */
    public Optional<Output<String>> parentPolicyTag() {
        return Optional.ofNullable(this.parentPolicyTag);
    }

    /**
     * Taxonomy the policy tag is associated with
     * 
     */
    @Import(name="taxonomy")
    private @Nullable Output<String> taxonomy;

    /**
     * @return Taxonomy the policy tag is associated with
     * 
     */
    public Optional<Output<String>> taxonomy() {
        return Optional.ofNullable(this.taxonomy);
    }

    private PolicyTagState() {}

    private PolicyTagState(PolicyTagState $) {
        this.childPolicyTags = $.childPolicyTags;
        this.description = $.description;
        this.displayName = $.displayName;
        this.name = $.name;
        this.parentPolicyTag = $.parentPolicyTag;
        this.taxonomy = $.taxonomy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyTagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyTagState $;

        public Builder() {
            $ = new PolicyTagState();
        }

        public Builder(PolicyTagState defaults) {
            $ = new PolicyTagState(Objects.requireNonNull(defaults));
        }

        /**
         * @param childPolicyTags Resource names of child policy tags of this policy tag.
         * 
         * @return builder
         * 
         */
        public Builder childPolicyTags(@Nullable Output<List<String>> childPolicyTags) {
            $.childPolicyTags = childPolicyTags;
            return this;
        }

        /**
         * @param childPolicyTags Resource names of child policy tags of this policy tag.
         * 
         * @return builder
         * 
         */
        public Builder childPolicyTags(List<String> childPolicyTags) {
            return childPolicyTags(Output.of(childPolicyTags));
        }

        /**
         * @param childPolicyTags Resource names of child policy tags of this policy tag.
         * 
         * @return builder
         * 
         */
        public Builder childPolicyTags(String... childPolicyTags) {
            return childPolicyTags(List.of(childPolicyTags));
        }

        /**
         * @param description Description of this policy tag. It must: contain only unicode characters, tabs,
         * newlines, carriage returns and page breaks; and be at most 2000 bytes long when
         * encoded in UTF-8. If not set, defaults to an empty description.
         * If not set, defaults to an empty description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of this policy tag. It must: contain only unicode characters, tabs,
         * newlines, carriage returns and page breaks; and be at most 2000 bytes long when
         * encoded in UTF-8. If not set, defaults to an empty description.
         * If not set, defaults to an empty description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName User defined name of this policy tag. It must: be unique within the parent
         * taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces;
         * not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName User defined name of this policy tag. It must: be unique within the parent
         * taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces;
         * not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param name Resource name of this policy tag, whose format is:
         * &#34;projects/{project}/locations/{region}/taxonomies/{taxonomy}/policyTags/{policytag}&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name of this policy tag, whose format is:
         * &#34;projects/{project}/locations/{region}/taxonomies/{taxonomy}/policyTags/{policytag}&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentPolicyTag Resource name of this policy tag&#39;s parent policy tag.
         * If empty, it means this policy tag is a top level policy tag.
         * If not set, defaults to an empty string.
         * 
         * @return builder
         * 
         */
        public Builder parentPolicyTag(@Nullable Output<String> parentPolicyTag) {
            $.parentPolicyTag = parentPolicyTag;
            return this;
        }

        /**
         * @param parentPolicyTag Resource name of this policy tag&#39;s parent policy tag.
         * If empty, it means this policy tag is a top level policy tag.
         * If not set, defaults to an empty string.
         * 
         * @return builder
         * 
         */
        public Builder parentPolicyTag(String parentPolicyTag) {
            return parentPolicyTag(Output.of(parentPolicyTag));
        }

        /**
         * @param taxonomy Taxonomy the policy tag is associated with
         * 
         * @return builder
         * 
         */
        public Builder taxonomy(@Nullable Output<String> taxonomy) {
            $.taxonomy = taxonomy;
            return this;
        }

        /**
         * @param taxonomy Taxonomy the policy tag is associated with
         * 
         * @return builder
         * 
         */
        public Builder taxonomy(String taxonomy) {
            return taxonomy(Output.of(taxonomy));
        }

        public PolicyTagState build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclCustomResponseBodyGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclDefaultActionGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclVisibilityConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclState extends com.pulumi.resources.ResourceArgs {

    public static final WebAclState Empty = new WebAclState();

    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The web ACL capacity units (WCUs) currently being used by this web ACL.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
     * 
     */
    @Import(name="customResponseBodies")
    private @Nullable Output<List<WebAclCustomResponseBodyGetArgs>> customResponseBodies;

    public Optional<Output<List<WebAclCustomResponseBodyGetArgs>>> customResponseBodies() {
        return Optional.ofNullable(this.customResponseBodies);
    }

    /**
     * The action to perform if none of the `rules` contained in the WebACL match. See Default Action below for details.
     * 
     */
    @Import(name="defaultAction")
    private @Nullable Output<WebAclDefaultActionGetArgs> defaultAction;

    public Optional<Output<WebAclDefaultActionGetArgs>> defaultAction() {
        return Optional.ofNullable(this.defaultAction);
    }

    /**
     * A friendly description of the WebACL.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="lockToken")
    private @Nullable Output<String> lockToken;

    public Optional<Output<String>> lockToken() {
        return Optional.ofNullable(this.lockToken);
    }

    /**
     * The label string.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<WebAclRuleGetArgs>> rules;

    public Optional<Output<List<WebAclRuleGetArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * An map of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @Import(name="visibilityConfig")
    private @Nullable Output<WebAclVisibilityConfigGetArgs> visibilityConfig;

    public Optional<Output<WebAclVisibilityConfigGetArgs>> visibilityConfig() {
        return Optional.ofNullable(this.visibilityConfig);
    }

    private WebAclState() {}

    private WebAclState(WebAclState $) {
        this.arn = $.arn;
        this.capacity = $.capacity;
        this.customResponseBodies = $.customResponseBodies;
        this.defaultAction = $.defaultAction;
        this.description = $.description;
        this.lockToken = $.lockToken;
        this.name = $.name;
        this.rules = $.rules;
        this.scope = $.scope;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.visibilityConfig = $.visibilityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclState $;

        public Builder() {
            $ = new WebAclState();
        }

        public Builder(WebAclState defaults) {
            $ = new WebAclState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        public Builder customResponseBodies(@Nullable Output<List<WebAclCustomResponseBodyGetArgs>> customResponseBodies) {
            $.customResponseBodies = customResponseBodies;
            return this;
        }

        public Builder customResponseBodies(List<WebAclCustomResponseBodyGetArgs> customResponseBodies) {
            return customResponseBodies(Output.of(customResponseBodies));
        }

        public Builder customResponseBodies(WebAclCustomResponseBodyGetArgs... customResponseBodies) {
            return customResponseBodies(List.of(customResponseBodies));
        }

        public Builder defaultAction(@Nullable Output<WebAclDefaultActionGetArgs> defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        public Builder defaultAction(WebAclDefaultActionGetArgs defaultAction) {
            return defaultAction(Output.of(defaultAction));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder lockToken(@Nullable Output<String> lockToken) {
            $.lockToken = lockToken;
            return this;
        }

        public Builder lockToken(String lockToken) {
            return lockToken(Output.of(lockToken));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder rules(@Nullable Output<List<WebAclRuleGetArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<WebAclRuleGetArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(WebAclRuleGetArgs... rules) {
            return rules(List.of(rules));
        }

        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder visibilityConfig(@Nullable Output<WebAclVisibilityConfigGetArgs> visibilityConfig) {
            $.visibilityConfig = visibilityConfig;
            return this;
        }

        public Builder visibilityConfig(WebAclVisibilityConfigGetArgs visibilityConfig) {
            return visibilityConfig(Output.of(visibilityConfig));
        }

        public WebAclState build() {
            return $;
        }
    }

}

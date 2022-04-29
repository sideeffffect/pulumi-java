// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2;

import com.pulumi.awsnative.wafv2.enums.RegexPatternSetScope;
import com.pulumi.awsnative.wafv2.inputs.RegexPatternSetTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegexPatternSetArgs extends ResourceArgs {

    public static final RegexPatternSetArgs Empty = new RegexPatternSetArgs();

    /**
     * Description of the entity.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the entity.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the RegexPatternSet.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the RegexPatternSet.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="regularExpressionList", required=true)
    private Output<List<String>> regularExpressionList;

    public Output<List<String>> regularExpressionList() {
        return this.regularExpressionList;
    }

    /**
     * Use CLOUDFRONT for CloudFront RegexPatternSet, use REGIONAL for Application Load Balancer and API Gateway.
     * 
     */
    @Import(name="scope", required=true)
    private Output<RegexPatternSetScope> scope;

    /**
     * @return Use CLOUDFRONT for CloudFront RegexPatternSet, use REGIONAL for Application Load Balancer and API Gateway.
     * 
     */
    public Output<RegexPatternSetScope> scope() {
        return this.scope;
    }

    @Import(name="tags")
    private @Nullable Output<List<RegexPatternSetTagArgs>> tags;

    public Optional<Output<List<RegexPatternSetTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private RegexPatternSetArgs() {}

    private RegexPatternSetArgs(RegexPatternSetArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.regularExpressionList = $.regularExpressionList;
        this.scope = $.scope;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegexPatternSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegexPatternSetArgs $;

        public Builder() {
            $ = new RegexPatternSetArgs();
        }

        public Builder(RegexPatternSetArgs defaults) {
            $ = new RegexPatternSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the entity.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the entity.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the RegexPatternSet.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the RegexPatternSet.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder regularExpressionList(Output<List<String>> regularExpressionList) {
            $.regularExpressionList = regularExpressionList;
            return this;
        }

        public Builder regularExpressionList(List<String> regularExpressionList) {
            return regularExpressionList(Output.of(regularExpressionList));
        }

        public Builder regularExpressionList(String... regularExpressionList) {
            return regularExpressionList(List.of(regularExpressionList));
        }

        /**
         * @param scope Use CLOUDFRONT for CloudFront RegexPatternSet, use REGIONAL for Application Load Balancer and API Gateway.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<RegexPatternSetScope> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Use CLOUDFRONT for CloudFront RegexPatternSet, use REGIONAL for Application Load Balancer and API Gateway.
         * 
         * @return builder
         * 
         */
        public Builder scope(RegexPatternSetScope scope) {
            return scope(Output.of(scope));
        }

        public Builder tags(@Nullable Output<List<RegexPatternSetTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<RegexPatternSetTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(RegexPatternSetTagArgs... tags) {
            return tags(List.of(tags));
        }

        public RegexPatternSetArgs build() {
            $.regularExpressionList = Objects.requireNonNull($.regularExpressionList, "expected parameter 'regularExpressionList' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}

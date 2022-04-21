// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront;

import com.pulumi.aws.cloudfront.inputs.DistributionCustomErrorResponseArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionDefaultCacheBehaviorArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionLoggingConfigArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionOriginArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionOriginGroupArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionRestrictionsArgs;
import com.pulumi.aws.cloudfront.inputs.DistributionViewerCertificateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionArgs Empty = new DistributionArgs();

    /**
     * Extra CNAMEs (alternate domain names), if any, for
     * this distribution.
     * 
     */
    @Import(name="aliases")
    private @Nullable Output<List<String>> aliases;

    public Optional<Output<List<String>>> aliases() {
        return Optional.ofNullable(this.aliases);
    }

    /**
     * Any comments you want to include about the
     * distribution.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * One or more custom error response elements (multiples allowed).
     * 
     */
    @Import(name="customErrorResponses")
    private @Nullable Output<List<DistributionCustomErrorResponseArgs>> customErrorResponses;

    public Optional<Output<List<DistributionCustomErrorResponseArgs>>> customErrorResponses() {
        return Optional.ofNullable(this.customErrorResponses);
    }

    /**
     * The default cache behavior for this distribution (maximum
     * one).
     * 
     */
    @Import(name="defaultCacheBehavior", required=true)
    private Output<DistributionDefaultCacheBehaviorArgs> defaultCacheBehavior;

    public Output<DistributionDefaultCacheBehaviorArgs> defaultCacheBehavior() {
        return this.defaultCacheBehavior;
    }

    /**
     * The object that you want CloudFront to
     * return (for example, index.html) when an end user requests the root URL.
     * 
     */
    @Import(name="defaultRootObject")
    private @Nullable Output<String> defaultRootObject;

    public Optional<Output<String>> defaultRootObject() {
        return Optional.ofNullable(this.defaultRootObject);
    }

    /**
     * A flag that specifies whether Origin Shield is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The maximum HTTP version to support on the
     * distribution. Allowed values are `http1.1` and `http2`. The default is
     * `http2`.
     * 
     */
    @Import(name="httpVersion")
    private @Nullable Output<String> httpVersion;

    public Optional<Output<String>> httpVersion() {
        return Optional.ofNullable(this.httpVersion);
    }

    /**
     * Whether the IPv6 is enabled for the distribution.
     * 
     */
    @Import(name="isIpv6Enabled")
    private @Nullable Output<Boolean> isIpv6Enabled;

    public Optional<Output<Boolean>> isIpv6Enabled() {
        return Optional.ofNullable(this.isIpv6Enabled);
    }

    /**
     * The logging
     * configuration that controls how logs are written
     * to your distribution (maximum one).
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<DistributionLoggingConfigArgs> loggingConfig;

    public Optional<Output<DistributionLoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * An ordered list of cache behaviors
     * resource for this distribution. List from top to bottom
     * in order of precedence. The topmost cache behavior will have precedence 0.
     * 
     */
    @Import(name="orderedCacheBehaviors")
    private @Nullable Output<List<DistributionOrderedCacheBehaviorArgs>> orderedCacheBehaviors;

    public Optional<Output<List<DistributionOrderedCacheBehaviorArgs>>> orderedCacheBehaviors() {
        return Optional.ofNullable(this.orderedCacheBehaviors);
    }

    /**
     * One or more origin_group for this
     * distribution (multiples allowed).
     * 
     */
    @Import(name="originGroups")
    private @Nullable Output<List<DistributionOriginGroupArgs>> originGroups;

    public Optional<Output<List<DistributionOriginGroupArgs>>> originGroups() {
        return Optional.ofNullable(this.originGroups);
    }

    /**
     * One or more origins for this
     * distribution (multiples allowed).
     * 
     */
    @Import(name="origins", required=true)
    private Output<List<DistributionOriginArgs>> origins;

    public Output<List<DistributionOriginArgs>> origins() {
        return this.origins;
    }

    /**
     * The price class for this distribution. One of
     * `PriceClass_All`, `PriceClass_200`, `PriceClass_100`
     * 
     */
    @Import(name="priceClass")
    private @Nullable Output<String> priceClass;

    public Optional<Output<String>> priceClass() {
        return Optional.ofNullable(this.priceClass);
    }

    /**
     * The restriction
     * configuration for this distribution (maximum one).
     * 
     */
    @Import(name="restrictions", required=true)
    private Output<DistributionRestrictionsArgs> restrictions;

    public Output<DistributionRestrictionsArgs> restrictions() {
        return this.restrictions;
    }

    /**
     * Disables the distribution instead of
     * deleting it when destroying the resource. If this is set,
     * the distribution needs to be deleted manually afterwards. Default: `false`.
     * 
     */
    @Import(name="retainOnDelete")
    private @Nullable Output<Boolean> retainOnDelete;

    public Optional<Output<Boolean>> retainOnDelete() {
        return Optional.ofNullable(this.retainOnDelete);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The SSL
     * configuration for this distribution (maximum
     * one).
     * 
     */
    @Import(name="viewerCertificate", required=true)
    private Output<DistributionViewerCertificateArgs> viewerCertificate;

    public Output<DistributionViewerCertificateArgs> viewerCertificate() {
        return this.viewerCertificate;
    }

    /**
     * If enabled, the resource will wait for
     * the distribution status to change from `InProgress` to `Deployed`. Setting
     * this to`false` will skip the process. Default: `true`.
     * 
     */
    @Import(name="waitForDeployment")
    private @Nullable Output<Boolean> waitForDeployment;

    public Optional<Output<Boolean>> waitForDeployment() {
        return Optional.ofNullable(this.waitForDeployment);
    }

    /**
     * A unique identifier that specifies the AWS WAF web ACL,
     * if any, to associate with this distribution.
     * To specify a web ACL created using the latest version of AWS WAF (WAFv2), use the ACL ARN,
     * for example `aws_wafv2_web_acl.example.arn`. To specify a web
     * ACL created using AWS WAF Classic, use the ACL ID, for example `aws_waf_web_acl.example.id`.
     * The WAF Web ACL must exist in the WAF Global (CloudFront) region and the
     * credentials configuring this argument must have `waf:GetWebACL` permissions assigned.
     * 
     */
    @Import(name="webAclId")
    private @Nullable Output<String> webAclId;

    public Optional<Output<String>> webAclId() {
        return Optional.ofNullable(this.webAclId);
    }

    private DistributionArgs() {}

    private DistributionArgs(DistributionArgs $) {
        this.aliases = $.aliases;
        this.comment = $.comment;
        this.customErrorResponses = $.customErrorResponses;
        this.defaultCacheBehavior = $.defaultCacheBehavior;
        this.defaultRootObject = $.defaultRootObject;
        this.enabled = $.enabled;
        this.httpVersion = $.httpVersion;
        this.isIpv6Enabled = $.isIpv6Enabled;
        this.loggingConfig = $.loggingConfig;
        this.orderedCacheBehaviors = $.orderedCacheBehaviors;
        this.originGroups = $.originGroups;
        this.origins = $.origins;
        this.priceClass = $.priceClass;
        this.restrictions = $.restrictions;
        this.retainOnDelete = $.retainOnDelete;
        this.tags = $.tags;
        this.viewerCertificate = $.viewerCertificate;
        this.waitForDeployment = $.waitForDeployment;
        this.webAclId = $.webAclId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionArgs $;

        public Builder() {
            $ = new DistributionArgs();
        }

        public Builder(DistributionArgs defaults) {
            $ = new DistributionArgs(Objects.requireNonNull(defaults));
        }

        public Builder aliases(@Nullable Output<List<String>> aliases) {
            $.aliases = aliases;
            return this;
        }

        public Builder aliases(List<String> aliases) {
            return aliases(Output.of(aliases));
        }

        public Builder aliases(String... aliases) {
            return aliases(List.of(aliases));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder customErrorResponses(@Nullable Output<List<DistributionCustomErrorResponseArgs>> customErrorResponses) {
            $.customErrorResponses = customErrorResponses;
            return this;
        }

        public Builder customErrorResponses(List<DistributionCustomErrorResponseArgs> customErrorResponses) {
            return customErrorResponses(Output.of(customErrorResponses));
        }

        public Builder customErrorResponses(DistributionCustomErrorResponseArgs... customErrorResponses) {
            return customErrorResponses(List.of(customErrorResponses));
        }

        public Builder defaultCacheBehavior(Output<DistributionDefaultCacheBehaviorArgs> defaultCacheBehavior) {
            $.defaultCacheBehavior = defaultCacheBehavior;
            return this;
        }

        public Builder defaultCacheBehavior(DistributionDefaultCacheBehaviorArgs defaultCacheBehavior) {
            return defaultCacheBehavior(Output.of(defaultCacheBehavior));
        }

        public Builder defaultRootObject(@Nullable Output<String> defaultRootObject) {
            $.defaultRootObject = defaultRootObject;
            return this;
        }

        public Builder defaultRootObject(String defaultRootObject) {
            return defaultRootObject(Output.of(defaultRootObject));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder httpVersion(@Nullable Output<String> httpVersion) {
            $.httpVersion = httpVersion;
            return this;
        }

        public Builder httpVersion(String httpVersion) {
            return httpVersion(Output.of(httpVersion));
        }

        public Builder isIpv6Enabled(@Nullable Output<Boolean> isIpv6Enabled) {
            $.isIpv6Enabled = isIpv6Enabled;
            return this;
        }

        public Builder isIpv6Enabled(Boolean isIpv6Enabled) {
            return isIpv6Enabled(Output.of(isIpv6Enabled));
        }

        public Builder loggingConfig(@Nullable Output<DistributionLoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        public Builder loggingConfig(DistributionLoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        public Builder orderedCacheBehaviors(@Nullable Output<List<DistributionOrderedCacheBehaviorArgs>> orderedCacheBehaviors) {
            $.orderedCacheBehaviors = orderedCacheBehaviors;
            return this;
        }

        public Builder orderedCacheBehaviors(List<DistributionOrderedCacheBehaviorArgs> orderedCacheBehaviors) {
            return orderedCacheBehaviors(Output.of(orderedCacheBehaviors));
        }

        public Builder orderedCacheBehaviors(DistributionOrderedCacheBehaviorArgs... orderedCacheBehaviors) {
            return orderedCacheBehaviors(List.of(orderedCacheBehaviors));
        }

        public Builder originGroups(@Nullable Output<List<DistributionOriginGroupArgs>> originGroups) {
            $.originGroups = originGroups;
            return this;
        }

        public Builder originGroups(List<DistributionOriginGroupArgs> originGroups) {
            return originGroups(Output.of(originGroups));
        }

        public Builder originGroups(DistributionOriginGroupArgs... originGroups) {
            return originGroups(List.of(originGroups));
        }

        public Builder origins(Output<List<DistributionOriginArgs>> origins) {
            $.origins = origins;
            return this;
        }

        public Builder origins(List<DistributionOriginArgs> origins) {
            return origins(Output.of(origins));
        }

        public Builder origins(DistributionOriginArgs... origins) {
            return origins(List.of(origins));
        }

        public Builder priceClass(@Nullable Output<String> priceClass) {
            $.priceClass = priceClass;
            return this;
        }

        public Builder priceClass(String priceClass) {
            return priceClass(Output.of(priceClass));
        }

        public Builder restrictions(Output<DistributionRestrictionsArgs> restrictions) {
            $.restrictions = restrictions;
            return this;
        }

        public Builder restrictions(DistributionRestrictionsArgs restrictions) {
            return restrictions(Output.of(restrictions));
        }

        public Builder retainOnDelete(@Nullable Output<Boolean> retainOnDelete) {
            $.retainOnDelete = retainOnDelete;
            return this;
        }

        public Builder retainOnDelete(Boolean retainOnDelete) {
            return retainOnDelete(Output.of(retainOnDelete));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder viewerCertificate(Output<DistributionViewerCertificateArgs> viewerCertificate) {
            $.viewerCertificate = viewerCertificate;
            return this;
        }

        public Builder viewerCertificate(DistributionViewerCertificateArgs viewerCertificate) {
            return viewerCertificate(Output.of(viewerCertificate));
        }

        public Builder waitForDeployment(@Nullable Output<Boolean> waitForDeployment) {
            $.waitForDeployment = waitForDeployment;
            return this;
        }

        public Builder waitForDeployment(Boolean waitForDeployment) {
            return waitForDeployment(Output.of(waitForDeployment));
        }

        public Builder webAclId(@Nullable Output<String> webAclId) {
            $.webAclId = webAclId;
            return this;
        }

        public Builder webAclId(String webAclId) {
            return webAclId(Output.of(webAclId));
        }

        public DistributionArgs build() {
            $.defaultCacheBehavior = Objects.requireNonNull($.defaultCacheBehavior, "expected parameter 'defaultCacheBehavior' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.origins = Objects.requireNonNull($.origins, "expected parameter 'origins' to be non-null");
            $.restrictions = Objects.requireNonNull($.restrictions, "expected parameter 'restrictions' to be non-null");
            $.viewerCertificate = Objects.requireNonNull($.viewerCertificate, "expected parameter 'viewerCertificate' to be non-null");
            return $;
        }
    }

}

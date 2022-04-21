// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetGroupArgs Empty = new GetTargetGroupArgs();

    /**
     * The full ARN of the target group.
     * 
     */
    @Import(name="arn")
    private @Nullable String arn;

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The unique name of the target group.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetTargetGroupArgs() {}

    private GetTargetGroupArgs(GetTargetGroupArgs $) {
        this.arn = $.arn;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetGroupArgs $;

        public Builder() {
            $ = new GetTargetGroupArgs();
        }

        public Builder(GetTargetGroupArgs defaults) {
            $ = new GetTargetGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable String arn) {
            $.arn = arn;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetTargetGroupArgs build() {
            return $;
        }
    }

}

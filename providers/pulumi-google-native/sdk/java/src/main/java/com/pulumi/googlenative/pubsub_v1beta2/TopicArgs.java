// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicArgs Empty = new TopicArgs();

    /**
     * The name of the topic. It must have the format `&#34;projects/{project}/topics/{topic}&#34;`. `{topic}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="topicId", required=true)
    private Output<String> topicId;

    public Output<String> topicId() {
        return this.topicId;
    }

    private TopicArgs() {}

    private TopicArgs(TopicArgs $) {
        this.name = $.name;
        this.project = $.project;
        this.topicId = $.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicArgs $;

        public Builder() {
            $ = new TopicArgs();
        }

        public Builder(TopicArgs defaults) {
            $ = new TopicArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder topicId(Output<String> topicId) {
            $.topicId = topicId;
            return this;
        }

        public Builder topicId(String topicId) {
            return topicId(Output.of(topicId));
        }

        public TopicArgs build() {
            $.topicId = Objects.requireNonNull($.topicId, "expected parameter 'topicId' to be non-null");
            return $;
        }
    }

}

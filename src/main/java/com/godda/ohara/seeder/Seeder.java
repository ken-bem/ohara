package com.godda.ohara.seeder;

import com.godda.ohara.models.story.arc.StoryArc;
import com.godda.ohara.models.story.arc.StoryArcRepository;
import com.godda.ohara.models.story.saga.Saga;
import com.godda.ohara.models.story.saga.SagaRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@AllArgsConstructor
public class Seeder implements ApplicationRunner {

    private StoryArcRepository storyArcRepository;
    private SagaRepository sagaRepository;

    private static String[] storyArcs = new String[]{
            "Romance Dawn",
            "Orange Town",
            "Syrup Village",
            "Baratie",
            "Arlong Park",
            "Loguetown"
    };

    @Override
    public void run(ApplicationArguments args) throws Exception {

        //East Blue Saga
        Saga eastBlueSaga = new Saga();
        eastBlueSaga.setName("East Blue Saga");
        eastBlueSaga.setDescription("The start of the story");

        Arrays
                .asList(storyArcs)
                .forEach(arc ->{
                    StoryArc curr = new StoryArc();
                    curr.setName(arc);
                    eastBlueSaga.addStoryArc(curr);
                });

        sagaRepository.save(eastBlueSaga);
    }
}
